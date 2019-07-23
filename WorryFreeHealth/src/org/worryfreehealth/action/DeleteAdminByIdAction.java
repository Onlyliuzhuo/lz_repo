package org.worryfreehealth.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.worryfreehealth.dao.AdminInfoDao;

import com.opensymphony.xwork2.ActionSupport;

public class DeleteAdminByIdAction extends ActionSupport{
	private String adminId;
	
	public String execute() throws Exception{
		AdminInfoDao aio = new AdminInfoDao();
		//System.out.println(adminId);
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");// 防止弹出的信息出现乱码
		PrintWriter out = response.getWriter();
		if (aio.deleteAdminById(adminId)) {
			out.print("<script>alert('删除成功！')</script>");
			out.print("<script>window.location.href='searchAdmin.jsp'</script>");
			out.flush();
			out.close();
			return NONE;
		} else {
			out.print("<script>alert('删除失败！')</script>");
			out.print("<script>window.location.href='searchAdmin.jsp'</script>");
			out.flush();
			out.close();
			return NONE;
		}		
	}
	
	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

}
