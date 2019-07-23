package org.worryfreehealth.action;

import java.io.File;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.worryfreehealth.dao.HospitalInfoDao;
import org.worryfreehealth.formbean.AddHospitalFormBean;

import com.opensymphony.xwork2.ActionSupport;

public class AddHospitalMessageAction extends ActionSupport{
	
	private AddHospitalFormBean ahfb;
	
	public String execute() throws Exception {

		HospitalInfoDao hio = new HospitalInfoDao();
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");// 防止弹出的信息出现乱码
		PrintWriter out = response.getWriter();

		if (ahfb.getUpload().exists()) {
			//System.out.println(System.getProperty("user.dir"));
			File f = new File("E:\\Users\\Administrator\\Workspaces\\MyEclipse Professional 2014\\WorryFreeHealth\\WebRoot\\UploadFile\\HospitalPicture");
		    if (!f.exists()) {
		      f.mkdir();
		    }    
			String viewPath = "UploadFile/HospitalPicture/"+ahfb.getUploadFileName();
			//System.out.println(realPath);
			if (hio.addHospitalMessage(ahfb, viewPath)) {
			    FileUtils.copyFile(ahfb.getUpload(), new File(f, ahfb.getUploadFileName()));
				out.print("<script>alert('添加成功！')</script>");
				out.print("<script>window.location.href='addHospital.jsp'</script>");
				out.flush();
				out.close();
				return NONE;
			}else {
				out.print("<script>alert('添加失败！')</script>");
				out.print("<script>window.location.href='addHospital.jsp'</script>");
				out.flush();
				out.close();
				return NONE;
			}		
		}else {
			if(hio.addHospitalMessage(ahfb)){
				out.print("<script>alert('添加成功！')</script>");
				out.print("<script>window.location.href='addHospital.jsp'</script>");
				out.flush();
				out.close();
				return NONE;				
			}else{
				out.print("<script>alert('添加失败！')</script>");
				out.print("<script>window.location.href='addHospital.jsp' </script>");
				out.flush();
				out.close();
				return NONE;	
			}
		}
	}

	public AddHospitalFormBean getAhfb() {
		return ahfb;
	}

	public void setAhfb(AddHospitalFormBean ahfb) {
		this.ahfb = ahfb;
	}

}
