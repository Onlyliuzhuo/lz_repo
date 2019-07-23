package org.worryfreehealth.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.worryfreehealth.dao.HospitalInfoDao;
import org.worryfreehealth.dao.OrderListInfoDao;
import org.worryfreehealth.vo.OrderListInfo;

import com.opensymphony.xwork2.ActionSupport;

public class SearchOrderListStateAction extends ActionSupport{
	
	private String orderListId;
	
	public String execute() throws Exception{
		OrderListInfoDao lio = new OrderListInfoDao();
		HttpServletRequest request = ServletActionContext.getRequest();
		List<OrderListInfo> list = lio.queryOrderList(orderListId);
		request.setAttribute("count", list.size());
		if(!list.isEmpty()){
			request.setAttribute("orderList", list);
		}
		return SUCCESS;		
	}

	public String getOrderListId() {
		return orderListId;
	}

	public void setOrderListId(String orderListId) {
		this.orderListId = orderListId;
	}

}
