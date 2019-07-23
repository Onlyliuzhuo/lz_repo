package org.worryfreehealth.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.worryfreehealth.dao.DoctorInfoDao;
import org.worryfreehealth.dao.MessageBoardInfoDao;

import com.opensymphony.xwork2.ActionSupport;

public class ExaminMessageAction extends ActionSupport{
	
	private String messageId;
	

	public String execute() throws Exception{
		MessageBoardInfoDao mio = new MessageBoardInfoDao();
		//System.out.println(doctorId);
		//System.out.println("1111");
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");// 防止弹出的信息出现乱码
		PrintWriter out = response.getWriter();
		if (mio.examineMessageById(messageId)) {
			out.print("<script>alert('审核成功！')</script>");
			out.print("<script>window.location.href='examinThenSearchMessage.action'</script>");
			out.flush();
			out.close();
			return NONE;
		} else {
			out.print("<script>alert('失败！')</script>");
			out.print("<script>window.location.href='examinThenSearchMessage.action'</script>");
			out.flush();
			out.close();
			return NONE;
		}		
	}
	
	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
}
