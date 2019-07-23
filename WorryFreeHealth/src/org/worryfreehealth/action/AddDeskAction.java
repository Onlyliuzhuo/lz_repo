package org.worryfreehealth.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.worryfreehealth.dao.DeskInfoDao;

import com.opensymphony.xwork2.ActionSupport;

public class AddDeskAction extends ActionSupport{
	
	private String deskID;
	private String deskName;
	private String deskTel;
	private String level;
		
	public String execute() throws Exception {
		DeskInfoDao dio = new DeskInfoDao();
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");// 防止弹出的信息出现乱码
		PrintWriter out = response.getWriter();
		if (dio.saveDesk(deskID, deskName, deskTel, level)) {
			out.print("<script>alert('添加成功！')</script>");
			out.print("<script>window.location.href='addDesk.jsp'</script>");
			out.flush();
			out.close();
			return NONE;
		} else {
			out.print("<script>alert('添加失败！')</script>");
			out.print("<script>window.location.href='addDesk.jsp'</script>");
			out.flush();
			out.close();
			return NONE;
		}
	}		
	public String getDeskID() {
		return deskID;
	}
	public void setDeskID(String deskID) {
		this.deskID = deskID;
	}
	public String getDeskName() {
		return deskName;
	}
	public void setDeskName(String deskName) {
		this.deskName = deskName;
	}
	public String getDeskTel() {
		return deskTel;
	}
	public void setDeskTel(String deskTel) {
		this.deskTel = deskTel;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}

}
