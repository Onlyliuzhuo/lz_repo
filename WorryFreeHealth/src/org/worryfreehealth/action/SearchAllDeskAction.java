package org.worryfreehealth.action;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.worryfreehealth.dao.DeskInfoDao;
import org.worryfreehealth.vo.DeskInfo;

import com.opensymphony.xwork2.ActionSupport;

public class SearchAllDeskAction extends ActionSupport{
	public String execute() throws Exception {
		DeskInfoDao dio = new DeskInfoDao();
		HttpServletRequest request = ServletActionContext.getRequest();
		List<DeskInfo> list = dio.queryAllDesk();
		//System.out.println("000");
		request.setAttribute("count", list.size());
		if (!list.isEmpty()) {
			request.setAttribute("desk", list);
		}
		return SUCCESS;
	}

}

