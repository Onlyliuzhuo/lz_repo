package org.worryfreehealth.dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.worryfreehealth.util.HibernateSessionFactory;
import org.worryfreehealth.vo.AdminInfo;

public class AdminInfoDao {

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
	 * ��¼ʱ��¼��¼ʱ��
	 * @param adminID
	 */
	public boolean adminLogin(String adminID) {
		
		try {
			getCurrentSession();
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//���Է�����޸����ڸ�ʽ
			String now = dateFormat.format(new Date());
			
			AdminInfo user = (AdminInfo) session.get(AdminInfo.class, adminID);
			user.setAdminLastLoginTime(now);
			session.update(user);
			ts.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} 
	}
	
	/**
	 * ����id�޸�����
	 * @param adminID
	 * @param newPassword
	 * @return
	 */
	public boolean updateAdminPassword(String adminID,String newPassword) {
		
		try {
			getCurrentSession();			
			AdminInfo user = (AdminInfo) session.get(AdminInfo.class, adminID);
			user.setAdminPassword(newPassword);
			session.update(user);
			ts.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} 
	}
	
    /**
     * ��¼
     * @return
     */
	public boolean adminLogin(String adminID,String adminPassword) {
		
		try {
			getCurrentSession();			
			Query query = session.createQuery("from AdminInfo where adminId=? and adminPassword=? ");
			query.setParameter(0, adminID);
			query.setParameter(1, adminPassword);
			List lt = query.list();
			//System.out.println("11");
			if(!lt.isEmpty()){
				return true;
			}else return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			session.flush();
			closeSession();
		}
	}
	
    /**
     * ��ѯ���й���Ա��Ϣ
     * @return
     */
	public List<AdminInfo> queryAllUser() {

		List<AdminInfo> lt = new ArrayList<AdminInfo>();
		try {
			getCurrentSession();
			Query query = session
					.createQuery("from AdminInfo ");
			lt = query.list();
			//System.out.println("11");
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
	 * �����˺Ż���������ѯ����Ա��Ϣ
	 * 
	 * @param adminID
	 * @return
	 */
	public List<AdminInfo> queryUser(String adminID) {

		List<AdminInfo> lt = new ArrayList<AdminInfo>();
		try {
			getCurrentSession();
			Query query = session
					.createQuery("from AdminInfo where adminId like ? or adminName like ?");
			query.setParameter(0, "%"+adminID+"%");
			query.setParameter(1, "%"+adminID+"%");
			lt = query.list();
			//for (int i = 0; i < list.size(); i++) {
			//	AdminInfo admin = (AdminInfo) list.get(i);
			//	lt.add(admin);
			//	System.out.println(admin.getAdminId());
				// System.out.println(user.getAdminTel());
			//}
			return lt;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			closeSession();
		}
	}
	
	/**
	 * �����˺Ų�ѯ����Ա��Ϣ
	 * 
	 * @param adminID
	 * @return
	 */
	public List<AdminInfo> queryUserById(String adminID) {

		List<AdminInfo> lt = new ArrayList<AdminInfo>();
		try {
			getCurrentSession();
			Query query = session
					.createQuery("from AdminInfo where adminId=?");
			query.setParameter(0, adminID);
			query.setParameter(1, adminID);
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
	 * ���ӹ���Ա
	 * 
	 * @param adminID
	 * @param adminPassword
	 * @param adminName
	 * @param adminTel
	 * @return
	 */
	public boolean saveUser(String adminID, String adminPassword,
			String adminName, String adminTel) {
		// TODO Auto-generated method stub
		try {
			getCurrentSession();
			AdminInfo admin = new AdminInfo();
			admin.setAdminId(adminID);
			admin.setAdminPassword(adminPassword);
			admin.setAdminName(adminName);
			admin.setAdminTel(adminTel);
			//System.out.println(admin.getAdminId());
			// System.out.println(user.getPassword());
			session.save(admin);
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
	 * 
	 * �����˺�ɾ������Ա
	 * 
	 * @param adminId
	 */
	public boolean deleteAdminById(String adminId) {
		// Transaction t3 = session.beginTransaction();
		try {
			getCurrentSession();
			AdminInfo user = (AdminInfo) session.get(AdminInfo.class, adminId);
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
	 * ����id�޸Ĺ���Ա��Ϣ
	 * @param adminID
	 * @param adminName
	 * @param adminPassword
	 * @param adminTel
	 * @return
	 */
	public boolean updateAdminById(String adminID,String adminName,String adminPassword,String adminTel) {
		try {
			getCurrentSession();
			AdminInfo admin = (AdminInfo) session.get(AdminInfo.class, adminID);
			admin.setAdminName(adminName);
			admin.setAdminPassword(adminPassword);
			admin.setAdminTel(adminTel);
			//System.out.println(adminName);
			session.update(admin);
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
