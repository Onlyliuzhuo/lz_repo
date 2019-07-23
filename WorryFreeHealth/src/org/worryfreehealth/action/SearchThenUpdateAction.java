package org.worryfreehealth.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.worryfreehealth.dao.DeskInfoDao;
import org.worryfreehealth.vo.DeskInfo;

import com.opensymphony.xwork2.ActionSupport;

public class SearchThenUpdateAction extends ActionSupport{
	private String deskId;
	
	public String execute() throws Exception{
		DeskInfoDao aio = new DeskInfoDao();
		//System.out.println(deskId);
		HttpServletRequest request = ServletActionContext.getRequest();
		List<DeskInfo> list = aio.queryDeskByIdUpdate(deskId);
		request.setAttribute("count", list.size());
		if(!list.isEmpty()){
			request.setAttribute("desk", list);
		}
		return SUCCESS;		
	}
	
	public String getDeskId() {
		return deskId;
	}

	public void setDeskId(String deskId) {
		this.deskId = deskId;
	}
}
