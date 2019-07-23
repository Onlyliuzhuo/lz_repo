package org.worryfreehealth.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.worryfreehealth.util.HibernateSessionFactory;
import org.worryfreehealth.vo.DoctorInfo;
import org.worryfreehealth.vo.MessageBoardInfo;
import org.worryfreehealth.vo.OrderListInfo;

public class MessageBoardInfoDao {
	
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
	 * ������ѯ���/�����˺�/��������/ҽ���˺�/ҽ������/��ѯ��Ϣ/�ظ���Ϣ������ѯ��Ϣ
	 * @param messageId
	 * @return list
	 */
	public List<MessageBoardInfo> queryMessageBoardInfo(String messageId) {

		List<MessageBoardInfo> lt = new ArrayList<MessageBoardInfo>();
		try {
			getCurrentSession();
			Query query = session.createQuery("from MessageBoardInfo where messageId = ? or patientId = ? or doctorId = ? or patientName like ? or doctorName like ? or patientMessage like ? or doctorReply like ?");
			query.setParameter(0, messageId);
			query.setParameter(1, messageId);
			query.setParameter(2, messageId);
			query.setParameter(3, "%"+messageId+"%");
			query.setParameter(4, "%"+messageId+"%");
			query.setParameter(5, "%"+messageId+"%");
			query.setParameter(6, "%"+messageId+"%");
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
	 * ��ѯδ��˵���ѯ��Ϣ
	 * @return List<MessageBoardInfo>
	 */
	public List<MessageBoardInfo> queryMessageBoardInfoIfExamined() {

		List<MessageBoardInfo> lt = new ArrayList<MessageBoardInfo>();
		try {
			getCurrentSession();
			Query query = session.createQuery("from MessageBoardInfo where messageIsExamined = ?");
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
	 * ��ѯ������ѯ��Ϣ
	 * @return List<MessageBoardInfo>
	 */
	public List<MessageBoardInfo> queryAllMessageBoardInfo() {

		List<MessageBoardInfo> lt = new ArrayList<MessageBoardInfo>();
		try {
			getCurrentSession();
			Query query = session.createQuery("from MessageBoardInfo ");
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
	 * ����IDɾ����ѯ��Ϣ
	 * @param messageId
	 * @return
	 */
	public boolean deleteMessageBoardById(String messageId) {
		// Transaction t3 = session.beginTransaction();
		try {
			getCurrentSession();
			MessageBoardInfo user = (MessageBoardInfo) session.get(MessageBoardInfo.class, messageId);
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
	 * ���
	 * @param messageId
	 * @return boolean
	 */
	public boolean examineMessageById(String messageId) {
		// Transaction t3 = session.beginTransaction();
		try {
			getCurrentSession();
			MessageBoardInfo user = (MessageBoardInfo) session.get(MessageBoardInfo.class, messageId);
			user.setMessageIsExamined(1);
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
}
