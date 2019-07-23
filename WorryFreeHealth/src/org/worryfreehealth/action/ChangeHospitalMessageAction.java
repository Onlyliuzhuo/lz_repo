package org.worryfreehealth.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.worryfreehealth.dao.HospitalInfoDao;
import org.worryfreehealth.formbean.ChangeHospitalFormBean;

import com.opensymphony.xwork2.ActionSupport;

public class ChangeHospitalMessageAction extends ActionSupport {

	private ChangeHospitalFormBean chfb;

	public ChangeHospitalFormBean getChfb() {
		return chfb;
	}

	public void setChfb(ChangeHospitalFormBean chfb) {
		this.chfb = chfb;
	}

	public String execute() throws Exception {

		HospitalInfoDao hio = new HospitalInfoDao();
		String hospitalId = chfb.getHospitalId();
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");// 防止弹出的信息出现乱码
		PrintWriter out = response.getWriter();

		if (chfb.getUpload().exists()) {
			//System.out.println(System.getProperty("user.dir"));
			File f = new File("E:\\Users\\Administrator\\Workspaces\\MyEclipse Professional 2014\\WorryFreeHealth\\WebRoot\\UploadFile\\HospitalPicture");
		    if (!f.exists()) {
		      f.mkdir();
		    }    
			String viewPath = "UploadFile/HospitalPicture/"+chfb.getUploadFileName();
			//System.out.println(realPath);
			if (hio.changeHospitalById(chfb, viewPath)) {
			    FileUtils.copyFile(chfb.getUpload(), new File(f, chfb.getUploadFileName()));
				out.print("<script>alert('修改成功！')</script>");
				out.print("<script>window.location.href='searchHospital.jsp'</script>");
				out.flush();
				out.close();
				return NONE;
			}else {
				out.print("<script>alert('修改失败！')</script>");
				out.print("<script>window.location.href='searchHospital.jsp'</script>");
				out.flush();
				out.close();
				return NONE;
			}		
		}else {
			if(hio.changeHospitalById(chfb)){
				out.print("<script>alert('修改成功！')</script>");
				out.print("<script>window.location.href='searchHospital.jsp'</script>");
				out.flush();
				out.close();
				return NONE;				
			}else{
				out.print("<script>alert('修改失败！')</script>");
				out.print("<script>window.location.href='searchHospital.jsp' </script>");
				out.flush();
				out.close();
				return NONE;	
			}
		}
	}
}
