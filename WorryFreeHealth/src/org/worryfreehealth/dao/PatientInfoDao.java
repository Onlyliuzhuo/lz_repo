package org.worryfreehealth.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.worryfreehealth.util.HibernateSessionFactory;
import org.worryfreehealth.vo.AdminInfo;
import org.worryfreehealth.vo.DoctorInfo;
import org.worryfreehealth.vo.PatientInfo;

public class PatientInfoDao {
	
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
	 * �����˺Ż����������һ���
	 * @param patientID
	 * @return
	 */
	public List<PatientInfo> queryPatient(String patientID) {

		List<PatientInfo> lt = new ArrayList<PatientInfo>();
		try {
			getCurrentSession();
			Query query = session
					.createQuery("from PatientInfo where (patientId like ? or patientName like ?) and patientIsUsed=1");
			query.setParameter(0, "%"+patientID+"%");
			query.setParameter(1, "%"+patientID+"%");
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
	 * ��ѯδ��˵Ļ���
	 * @return
	 */
	public List<PatientInfo> queryAllUserIfExamined() {

		List<PatientInfo> lt = new ArrayList<PatientInfo>();
		try {
			getCurrentSession();
			Query query = session.createQuery("from PatientInfo where patientIsExamined = ?");
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
	 * ��ѯʹ��״̬����
	 * @return
	 */
	public List<PatientInfo> queryAllUserIfUsed() {

		List<PatientInfo> lt = new ArrayList<PatientInfo>();
		try {
			getCurrentSession();
			Query query = session.createQuery("from PatientInfo where patientIsUsed  = ?");
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
	 * ��˻�����Ϣ
	 * @param patientId
	 * @return
	 */
	public boolean examinePatientById(String patientId) {
		// Transaction t3 = session.beginTransaction();
		try {
			getCurrentSession();
			PatientInfo user = (PatientInfo) session.get(PatientInfo.class, patientId);
			user.setPatientIsExamined(1);
			user.setPatientIsUsed(1);
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
	 * ����id��ɾ������Ϣ
	 * @param patientId
	 * @return
	 */

	public boolean deletePatientById(String patientId) {
		// Transaction t3 = session.beginTransaction();
		try {
			getCurrentSession();
			PatientInfo user = (PatientInfo) session.get(PatientInfo.class, patientId);
			user.setPatientIsUsed(0);
			user.setPatientIsExamined(0);
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
	 * ����idɾ�����߼�¼
	 * @param patientId
	 * @return
	 */
	public boolean deletePatientRealById(String patientId) {
		// Transaction t3 = session.beginTransaction();
		try {
			getCurrentSession();
			PatientInfo user = (PatientInfo) session.get(PatientInfo.class, patientId);
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
