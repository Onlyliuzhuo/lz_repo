package org.worryfreehealth.dao;

import java.util.ArrayList;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.worryfreehealth.formbean.AddHospitalFormBean;
import org.worryfreehealth.formbean.ChangeHospitalFormBean;
import org.worryfreehealth.util.HibernateSessionFactory;
import org.worryfreehealth.vo.HospitalInfo;

public class HospitalInfoDao {

	private Session session;
	private Transaction ts;

	/**
	 * 获得session
	 */
	public void getCurrentSession() {
		session = HibernateSessionFactory.getSession();
		ts = session.beginTransaction();
	}

	/**
	 * 关闭session
	 */
	public void closeSession() {
		if (session != null) {
			HibernateSessionFactory.closeSession();
		}
	}

	/**
	 * 查询所有医院
	 * 
	 * @return
	 */
	public List<HospitalInfo> queryAllHospital() {

		List<HospitalInfo> lt = new ArrayList<HospitalInfo>();
		try {
			getCurrentSession();
			Query query = session.createQuery("from HospitalInfo");
			lt = query.list();
			return lt;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			closeSession();
		}
	}

	/**
	 * 根据编号、名字、类型或者级别查找医院
	 * 
	 * @param hospitalID
	 * @return
	 */
	public List<HospitalInfo> queryHospital(String hospitalID) {

		List<HospitalInfo> lt = new ArrayList<HospitalInfo>();
		try {
			getCurrentSession();
			Query query = session
					.createQuery("from HospitalInfo where hospitalId like ? or hospitalName like ? or hospitalMajor like ? or hospitalLevel like ?");
			query.setParameter(0, "%" + hospitalID + "%");
			query.setParameter(1, "%" + hospitalID + "%");
			query.setParameter(2, "%" + hospitalID + "%");
			query.setParameter(3, "%" + hospitalID + "%");
			lt = query.list();
			return lt;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			closeSession();
		}
	}

	/**
	 * 根据编号查找医院
	 * 
	 * @param hospitalID
	 * @return
	 */
	public List<HospitalInfo> queryHospitalById(String hospitalID) {

		List<HospitalInfo> lt = new ArrayList<HospitalInfo>();
		try {
			getCurrentSession();
			Query query = session
					.createQuery("from HospitalInfo where hospitalId=?");
			query.setParameter(0, hospitalID);
			lt = query.list();
			return lt;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			closeSession();
		}
	}

	/**
	 * 根据id删除医院信息
	 * 
	 * @param hospitalId
	 * @return
	 */

	public boolean deleteHospitalById(String hospitalId) {
		// Transaction t3 = session.beginTransaction();
		try {
			getCurrentSession();
			HospitalInfo user = (HospitalInfo) session.get(HospitalInfo.class,
					hospitalId);
			session.delete(user);
			ts.commit();
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		} finally {
			closeSession();
		}
	}

	/**
	 * 根据id修改医院信息（可修改图片）
	 * 
	 * @param hfb
	 * @param realPath
	 * @return
	 */
	public boolean changeHospitalById(ChangeHospitalFormBean hfb,
			String realPath) {
		// Transaction t3 = session.beginTransaction();
		try {
			getCurrentSession();
			HospitalInfo user = (HospitalInfo) session.get(HospitalInfo.class,
					hfb.getHospitalId());
			user.setHospitalPicture(realPath);
			user.setHospitalName(hfb.getHospitalName());
			user.setHospitalWebsite(hfb.getHospitalWebsite());
			user.setHospitalAdress(hfb.getHospitalAddress());
			user.setHospitalMajor(hfb.getHospitalMajor());
			user.setHospitalLevel(hfb.getHospitalLevel());
			user.setHospitalRegRule(hfb.getHospitalRegRule());
			user.setHospitalDescribe(hfb.getHospitalDescribe());
			session.update(user);
			ts.commit();
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		} finally {
			closeSession();
		}
	}

	/**
	 * 根据id修改信息（不改图片）
	 * 
	 * @param hfb
	 * @return
	 */
	public boolean changeHospitalById(ChangeHospitalFormBean hfb) {
		// Transaction t3 = session.beginTransaction();
		try {
			getCurrentSession();
			HospitalInfo user = (HospitalInfo) session.get(HospitalInfo.class,
					hfb.getHospitalId());
			user.setHospitalName(hfb.getHospitalName());
			user.setHospitalWebsite(hfb.getHospitalWebsite());
			user.setHospitalAdress(hfb.getHospitalAddress());
			user.setHospitalMajor(hfb.getHospitalMajor());
			user.setHospitalLevel(hfb.getHospitalLevel());
			user.setHospitalRegRule(hfb.getHospitalRegRule());
			user.setHospitalDescribe(hfb.getHospitalDescribe());
			session.update(user);
			ts.commit();
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		} finally {
			closeSession();
		}
	}

	/**
	 * 增加医院（修改图片）
	 * @param hfb
	 * @param viewPath
	 * @return boolean
	 */
	public boolean addHospitalMessage(AddHospitalFormBean hfb,String viewPath) {

		try {
			getCurrentSession();
			HospitalInfo user = new HospitalInfo();
			user.setHospitalPicture(viewPath);
			user.setHospitalId(hfb.getHospitalId());
			user.setHospitalName(hfb.getHospitalName());
			user.setHospitalWebsite(hfb.getHospitalWebsite());
			user.setHospitalAdress(hfb.getHospitalAddress());
			user.setHospitalMajor(hfb.getHospitalMajor());
			user.setHospitalLevel(hfb.getHospitalLevel());
			user.setHospitalRegRule(hfb.getHospitalRegRule());
			user.setHospitalDescribe(hfb.getHospitalDescribe());
			session.save(user);
			ts.commit();
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		} finally {
			closeSession();
		}
	}
	
	/**
	 * 增加医院（不上传图片）
	 * @param hfb
	 * @return boolean
	 */
	public boolean addHospitalMessage(AddHospitalFormBean hfb) {

		try {
			getCurrentSession();
			HospitalInfo user = new HospitalInfo();
			user.setHospitalId(hfb.getHospitalId());
			user.setHospitalName(hfb.getHospitalName());
			user.setHospitalWebsite(hfb.getHospitalWebsite());
			user.setHospitalAdress(hfb.getHospitalAddress());
			user.setHospitalMajor(hfb.getHospitalMajor());
			user.setHospitalLevel(hfb.getHospitalLevel());
			user.setHospitalRegRule(hfb.getHospitalRegRule());
			user.setHospitalDescribe(hfb.getHospitalDescribe());
			session.save(user);
			ts.commit();
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		} finally {
			closeSession();
		}
	}
}
