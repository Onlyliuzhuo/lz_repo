package org.worryfreehealth.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.worryfreehealth.dao.HospitalInfoDao;
import org.worryfreehealth.dao.OrderListInfoDao;

import com.opensymphony.xwork2.ActionSupport;

public class DeleteOrderListAction extends ActionSupport{
	
	private String orderListId;
	
	public String execute() throws Exception{
		OrderListInfoDao lio = new OrderListInfoDao();
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");// ��ֹ��������Ϣ��������
		PrintWriter out = response.getWriter();
		if (lio.deleteOrderListById(orderListId)) {
			out.print("<script>alert('ɾ���ɹ���')</script>");
			out.print("<script>window.location.href='deleteThenSearchOrderList.action'</script>");
			out.flush();
			out.close();
		} else {
			out.print("<script>alert('ɾ��ʧ�ܣ�')</script>");
			out.print("<script>window.location.href='deleteThenSearchOrderList.action'</script>");
			out.flush();
			out.close();
		}
		return NONE;
	}
	
	public String getOrderListId() {
		return orderListId;
	}

	public void setOrderListId(String orderListId) {
		this.orderListId = orderListId;
	}

}
