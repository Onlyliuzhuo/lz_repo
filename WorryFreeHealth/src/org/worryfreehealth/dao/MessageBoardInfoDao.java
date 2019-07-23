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
	 * 根据咨询编号/患者账号/患者姓名/医生账号/医生姓名/咨询信息/回复信息查找咨询信息
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
	 * 查询未审核的咨询信息
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
	 * 查询所有咨询信息
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
	 * 根据ID删除咨询信息
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
	 * 审核
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
