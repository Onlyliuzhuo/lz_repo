package org.worryfreehealth.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.worryfreehealth.util.HibernateSessionFactory;
import org.worryfreehealth.vo.AdminInfo;
import org.worryfreehealth.vo.DeskInfo;

public class DeskInfoDao {
	
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
	 * ��ѯ���п�����Ϣ
	 */
	public List<DeskInfo> queryAllDesk() {

		List<DeskInfo> lt = new ArrayList<DeskInfo>();
		try {
			getCurrentSession();
			Query query = session.createQuery("from DeskInfo ");
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
	 * ��ѯ����
	 * @param deskID
	 * @return
	 */
	public List<DeskInfo> queryDeskById(String deskID) {

		List<DeskInfo> lt = new ArrayList<DeskInfo>();
		try {
			getCurrentSession();
			Query query = session
					.createQuery("from DeskInfo where deskID like ? or deskName like ? or deskLevel like ?");
			query.setParameter(0, "%"+deskID+"%");
			query.setParameter(1, "%"+deskID+"%");
			query.setParameter(2, "%"+deskID+"%");
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
	 * �༭ҳ���ѯ������Ϣ
	 * @param deskID
	 * @return
	 */
	public List<DeskInfo> queryDeskByIdUpdate(String deskID) {

		List<DeskInfo> lt = new ArrayList<DeskInfo>();
		try {
			getCurrentSession();
			Query query = session
					.createQuery("from DeskInfo where deskID=?");
			query.setParameter(0, deskID);
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
	 * ���ӿ���
	 * @param deskID
	 * @param deskName
	 * @param deskTel
	 * @param level
	 * @return
	 */
	public boolean saveDesk(String deskID, String deskName,
			String deskTel, String level) {
		// TODO Auto-generated method stub
		try {
			getCurrentSession();
			DeskInfo desk = new DeskInfo();
			desk.setDeskId(deskID);
			desk.setDeskName(deskName);
			desk.setDeskTel(deskTel);
			desk.setDeskLevel(level);
			//System.out.println(admin.getAdminId());
			// System.out.println(user.getPassword());
			session.save(desk);
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
	 * ���ݱ��ɾ������
	 * @param DeskInfo
	 * @return
	 */
	public boolean deleteDeskById(String DeskInfo) {
		// Transaction t3 = session.beginTransaction();
		try {
			getCurrentSession();
			DeskInfo user = (DeskInfo) session.get(DeskInfo.class, DeskInfo);
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
     * ���ݱ���޸Ŀ�����Ϣ
     * @param deskID
     * @param deskName
     * @param deskTel
     * @param deskLevel
     * @return
     */
	public boolean updateDeskById(String deskID,String deskName,String deskTel,String deskLevel) {
		try {
			getCurrentSession();
			DeskInfo desk = (DeskInfo) session.get(DeskInfo.class, deskID);
			desk.setDeskName(deskName);
			desk.setDeskTel(deskTel);
			desk.setDeskLevel(deskLevel);
			//System.out.println(adminName);
			session.update(desk);
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
