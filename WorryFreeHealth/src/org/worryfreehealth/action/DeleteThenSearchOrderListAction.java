package org.worryfreehealth.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.worryfreehealth.dao.OrderListInfoDao;
import org.worryfreehealth.vo.OrderListInfo;

import com.opensymphony.xwork2.ActionSupport;

public class DeleteThenSearchOrderListAction extends ActionSupport{
	
	public String execute() throws Exception{
		OrderListInfoDao lio = new OrderListInfoDao();
		HttpServletRequest request = ServletActionContext.getRequest();
		List<OrderListInfo> list = lio.queryAllOrderList();
		request.setAttribute("count", list.size());
		if(!list.isEmpty()){
			request.setAttribute("orderList", list);
		}
		return SUCCESS;		
	}

}
