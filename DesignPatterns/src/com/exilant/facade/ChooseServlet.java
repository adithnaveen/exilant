package com.exilant.facade;

public class ChooseServlet {
	private HttpServlet httpServlet;
	private FtpServlet ftpServlet;
	private MailServlet mailServlet;
	
	public ChooseServlet(){
		this.httpServlet  = new HttpServlet();
		this.ftpServlet = new FtpServlet();
		this.mailServlet  = new MailServlet();
	}
	
	public void serveHttpServlet(){
		httpServlet.service();
	}
	public void serveHttpServlet(HttpPacket httpPacket){
		httpServlet.service(httpPacket);
	}
	
	public void serveFtpServlet(){
		ftpServlet.service();
	}
	
	public void serveMailServlet(){
		mailServlet.service();
	}
}

