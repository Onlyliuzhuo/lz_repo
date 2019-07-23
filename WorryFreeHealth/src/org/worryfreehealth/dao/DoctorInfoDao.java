package org.worryfreehealth.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.worryfreehealth.util.HibernateSessionFactory;
import org.worryfreehealth.vo.DeskInfo;
import org.worryfreehealth.vo.DoctorInfo;

public class DoctorInfoDao {
	
	private Session session;
	private Transaction ts;

	/**
	 * ���session
	 */
	public void getCurrentSession() {
		session = HibernateSessionFactory.getSession();
		ts = session.beginTransaction();
	}

	/**
	 * �ر�session
	 */
	public void closeSession() {
		if (session != null) {
			HibernateSessionFactory.closeSession();
		}
	}
	
	/**
	 * ��ѯ��������ʹ�õ��˺�
	 * @param doctorId
	 * @param isExamined
	 * @param isused
	 * @return
	 */
	public List<DoctorInfo> queryUser(String doctorId,int isExamined,int isused) {

		List<DoctorInfo> lt = new ArrayList<DoctorInfo>();
		try {
			getCurrentSession();
			Query query = session.createQuery("from DoctorInfo where (doctorId like ? or doctorName like ?) and doctorIsExamined = ? and doctorIsUsed =? ");
			query.setParameter(0, "%"+doctorId+"%");
			query.setParameter(1, "%"+doctorId+"%");
			query.setParameter(2, isExamined);
			query.setParameter(3, isused);
			lt = query.list();
			return lt;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.flush();
			closeSession();
		}
	}
	
	
	/**
	 * ��ѯ�˺�ʹ��״̬��ҽ��
	 * @return
	 */
	public List<DoctorInfo> queryAllUserIfUsed() {

		List<DoctorInfo> lt = new ArrayList<DoctorInfo>();
		try {
			getCurrentSession();
			Query query = session.createQuery("from DoctorInfo where doctorIsUsed  = ?");
			query.setParameter(0, 1);
			lt = query.list();
			return lt;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.flush();
			closeSession();
		}
	}
	/**
	 * ��ѯδ��˵�ҽ��
	 * @return
	 */
	public List<DoctorInfo> queryAllUserIfExamined() {

		List<DoctorInfo> lt = new ArrayList<DoctorInfo>();
		try {
			getCurrentSession();
			Query query = session.createQuery("from DoctorInfo where doctorIsExamined = ?");
			query.setParameter(0, 0);
			lt = query.list();
			return lt;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.flush();
			closeSession();
		}
	}
	
	/**
	 * ��ɾ
	 * @param doctorId
	 * @return
	 */
	public boolean deleteDoctorById(String doctorId) {
		// Transaction t3 = session.beginTransaction();
		try {
			getCurrentSession();
			DoctorInfo user = (DoctorInfo) session.get(DoctorInfo.class, doctorId);
			user.setDoctorIsExamined(0);
			user.setDoctorIsUsed(0);
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
	 * ���
	 * @param doctorId
	 * @return
	 */
	public boolean examineDoctorById(String doctorId) {
		// Transaction t3 = session.beginTransaction();
		try {
			getCurrentSession();
			DoctorInfo user = (DoctorInfo) session.get(DoctorInfo.class, doctorId);
			user.setDoctorIsExamined(1);
			user.setDoctorIsUsed(1);
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
	 * �����ݿ�ɾ��ҽ����¼
	 * @param doctorId
	 * @return
	 */
	public boolean deleteDoctorRealById(String doctorId) {
		// Transaction t3 = session.beginTransaction();
		try {
			getCurrentSession();
			DoctorInfo user = (DoctorInfo) session.get(DoctorInfo.class, doctorId);
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
}
