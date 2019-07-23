package org.worryfreehealth.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.worryfreehealth.dao.MessageBoardInfoDao;
import org.worryfreehealth.dao.OrderListInfoDao;

import com.opensymphony.xwork2.ActionSupport;

public class SearchThenDeleteMessageAction extends ActionSupport{
	
	private String messageId;
	
	public String execute() throws Exception{
		MessageBoardInfoDao mio = new MessageBoardInfoDao();
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");// 防止弹出的信息出现乱码
		PrintWriter out = response.getWriter();
		if (mio.deleteMessageBoardById(messageId)) {
			out.print("<script>alert('删除成功！')</script>");
			out.print("<script>window.location.href='searchMessageState.jsp'</script>");
			out.flush();
			out.close();
		} else {
			out.print("<script>alert('删除失败！')</script>");
			out.print("<script>window.location.href='searchMessageState.jsp'</script>");
			out.flush();
			out.close();
		}
		return NONE;
	}
	
	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

}
