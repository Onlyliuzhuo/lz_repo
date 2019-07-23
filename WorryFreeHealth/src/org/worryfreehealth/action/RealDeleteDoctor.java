package org.worryfreehealth.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.worryfreehealth.dao.AdminInfoDao;
import org.worryfreehealth.dao.DoctorInfoDao;

import com.opensymphony.xwork2.ActionSupport;

public class RealDeleteDoctor extends ActionSupport{
	
	private String doctorId;
	
	public String execute() throws Exception{
		DoctorInfoDao dio = new DoctorInfoDao();
		System.out.println(doctorId);
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");// ��ֹ��������Ϣ��������
		PrintWriter out = response.getWriter();
		if (dio.deleteDoctorRealById(doctorId)) {
			out.print("<script>alert('ɾ���ɹ���')</script>");
			out.print("<script>window.location.href='searchAllDoctor.action'</script>");
			out.flush();
			out.close();
			return NONE;
		} else {
			out.print("<script>alert('ɾ��ʧ�ܣ�')</script>");
			out.print("<script>window.location.href='searchAllDoctor.action'</script>");
			out.flush();
			out.close();
			return NONE;
		}		
	}
	
	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

}
