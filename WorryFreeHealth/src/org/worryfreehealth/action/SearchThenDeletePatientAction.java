package org.worryfreehealth.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.worryfreehealth.dao.PatientInfoDao;

import com.opensymphony.xwork2.ActionSupport;

public class SearchThenDeletePatientAction extends ActionSupport{
	
	
	private String patientId;
		
	public String execute() throws Exception{
		PatientInfoDao pio = new PatientInfoDao();
		//System.out.println(adminId);
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");// ��ֹ��������Ϣ��������
		PrintWriter out = response.getWriter();
		if (pio.deletePatientById(patientId)) {
			out.print("<script>alert('ɾ���ɹ���')</script>");
			out.print("<script>window.location.href='searchPatient.jsp'</script>");
			out.flush();
			out.close();
		} else {
			out.print("<script>alert('ɾ��ʧ�ܣ�')</script>");
			out.print("<script>window.location.href='searchPatient.jsp'</script>");
			out.flush();
			out.close();
		}
		return NONE;
	}
	
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
}
