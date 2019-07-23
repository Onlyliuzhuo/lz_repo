package org.worryfreehealth.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.worryfreehealth.dao.AdminInfoDao;

import com.opensymphony.xwork2.ActionSupport;

public class UpdateAdminPasswordAction extends ActionSupport{
	
	private String adminID;
	private String oldPassword;
	private String newPassword;
	private String newRePassword;
	
	
	public String execute() throws Exception{
		
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");// ��ֹ��������Ϣ��������
		PrintWriter out = response.getWriter();
		
		//System.out.println(adminID);
		//System.out.println(oldPassword);
		
		AdminInfoDao aio = new AdminInfoDao();
		if(aio.adminLogin(adminID, oldPassword)){
			if(aio.updateAdminPassword(adminID, newPassword)){
				out.print("<script>alert('�޸ĳɹ���')</script>");
				out.print("<script>top.location.href='login.jsp'</script>");
				out.flush();
				out.close();
			}
			else{
				out.print("<script>alert('�޸�ʧ�ܣ�')</script>");
				out.print("<script>window.location.href='changeAdmin.jsp'</script>");
				out.flush();
				out.close();				
			}
		}else{
			    out.print("<script>alert('ԭ�������')</script>");
			    out.print("<script>window.location.href='changeAdmin.jsp'</script>");
			    out.flush();
			    out.close();				
		}
		return NONE;		
	}
	
	/*public void validate(){
		if(pfb.getOldPassword()==null||pfb.getOldPassword().equals("")){
			addFieldError("pfb.oldPassword", "�����벻��Ϊ�գ�");
		}
		else if(pfb.getNewPassword()==null||pfb.getNewPassword().equals("")){
			addFieldError("pfb.newPassword", "�����벻��Ϊ�գ�");
		}
		else if(pfb.getNewRePassword()==null||pfb.getNewRePassword().equals("")){
			addFieldError("pfb.newRePassword", "ȷ�����벻��Ϊ�գ�");
		}
		else if(pfb.getNewPassword()==null||pfb.getNewPassword().equals("")){
			addFieldError("pfb.newRePassword", "�����벻��Ϊ�գ�");
		}
		else if(!pfb.getNewPassword().equals(pfb.getNewRePassword())){
			addFieldError("pfb.newRePassword", "�������벻һ�£�");
		}
	}*/
	
	public String getAdminID() {
		return adminID;
	}
	public void setAdminID(String adminID) {
		this.adminID = adminID;
	}
	public String getOldPassword() {
		return oldPassword;
	}
	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	public String getNewRePassword() {
		return newRePassword;
	}
	public void setNewRePassword(String newRePassword) {
		this.newRePassword = newRePassword;
	}
	
}
