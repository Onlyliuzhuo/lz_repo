package org.worryfreehealth.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.worryfreehealth.dao.HospitalInfoDao;

import com.opensymphony.xwork2.ActionSupport;

public class SearchThenDeleteHospitalAction extends ActionSupport{
	
	private String hospitalId;
	
	public String execute() throws Exception{
		HospitalInfoDao hio = new HospitalInfoDao();
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");// ��ֹ��������Ϣ��������
		PrintWriter out = response.getWriter();
		if (hio.deleteHospitalById(hospitalId)) {
			out.print("<script>alert('ɾ���ɹ���')</script>");
			out.print("<script>window.location.href='searchHospital.jsp'</script>");
			out.flush();
			out.close();
		} else {
			out.print("<script>alert('ɾ��ʧ�ܣ�')</script>");
			out.print("<script>window.location.href='searchHospital.jsp'</script>");
			out.flush();
			out.close();
		}
		return NONE;
	}
	
	

	public String getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(String hospitalId) {
		this.hospitalId = hospitalId;
	}

}
