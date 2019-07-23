package org.worryfreehealth.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.worryfreehealth.util.HibernateSessionFactory;
import org.worryfreehealth.vo.HospitalInfo;
import org.worryfreehealth.vo.OrderListInfo;

public class OrderListInfoDao {
	
	
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
	 * 根据编号、医生名字、患者名字或者订单日期查找订单
	 * @param orderListId
	 * @return list
	 */
	public List<OrderListInfo> queryOrderList(String orderListId) {

		List<OrderListInfo> lt = new ArrayList<OrderListInfo>();
		try {
			getCurrentSession();
			Query query = session.createQuery("from OrderListInfo where orderListId=? or doctorName like ? or patientName like ? or orderListDate like ? or orderListStartTime like ? or orderListEndTime like ? ");
			query.setParameter(0, orderListId);
			query.setParameter(1, "%"+orderListId+"%");
			query.setParameter(2, "%"+orderListId+"%");
			query.setParameter(3, "%"+orderListId+"%");
			query.setParameter(4, "%"+orderListId+"%");
			query.setParameter(5, "%"+orderListId+"%");
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
	 * 根据编号、医生名字、患者名字或者订单日期查找订单
	 * @return list
	 */
	public List<OrderListInfo> queryAllOrderList() {

		List<OrderListInfo> lt = new ArrayList<OrderListInfo>();
		try {
			getCurrentSession();
			Query query = session.createQuery("from OrderListInfo ");
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
	 * 根据id删除订单
	 * @param orderListId
	 * @return boolean
	 */
	public boolean deleteOrderListById(String orderListId) {
		// Transaction t3 = session.beginTransaction();
		try {
			getCurrentSession();
			OrderListInfo user = (OrderListInfo) session.get(OrderListInfo.class, orderListId);
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
