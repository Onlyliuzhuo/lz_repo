package org.worryfreehealth.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.worryfreehealth.dao.MessageBoardInfoDao;
import org.worryfreehealth.vo.MessageBoardInfo;

import com.opensymphony.xwork2.ActionSupport;

public class ExaminThenSearchMessageAction extends ActionSupport{
	
	public String execute() throws Exception{
		
		MessageBoardInfoDao mio = new MessageBoardInfoDao();
		HttpServletRequest request = ServletActionContext.getRequest();
		List<MessageBoardInfo> list = mio.queryMessageBoardInfoIfExamined();
		//System.out.println("000");
		request.setAttribute("count", list.size());
		if (!list.isEmpty()) {
			request.setAttribute("message", list);
		}
		return SUCCESS;
	}

}
