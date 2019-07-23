package org.worryfreehealth.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.worryfreehealth.dao.DeskInfoDao;

import com.opensymphony.xwork2.ActionSupport;

public class SearchThenDeleteDeskAction extends ActionSupport{

	private String deskId;
	
	public String execute() throws Exception{
		DeskInfoDao dio = new DeskInfoDao();
		//System.out.println(adminId);
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");// ��ֹ��������Ϣ��������
		PrintWriter out = response.getWriter();
		if (dio.deleteDeskById(deskId)) {
			out.print("<script>alert('ɾ���ɹ���')</script>");
			out.print("<script>window.location.href='searchDesk.jsp'</script>");
			out.flush();
			out.close();
		} else {
			out.print("<script>alert('ɾ��ʧ�ܣ�')</script>");
			out.print("<script>window.location.href='searchDesk.jsp'</script>");
			out.flush();
			out.close();
		}
		return NONE;
	}
	public String getDeskId() {
		return deskId;
	}

	public void setDeskId(String deskId) {
		this.deskId = deskId;
	}

}
