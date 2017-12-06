package com.exilant.facade;

class HttpPacket{
	String message;
	
	public String response(){
		return message;
	}
	
}


class HttpServlet implements Servlet{
	
	HttpPacket httpPacket;
	
	@Override
	public void service() {
		System.out.println("Http Servlet can handle any http request");
	}	
	public void service(HttpPacket httpPacket) {
		this.httpPacket = httpPacket;
		System.out.println("Http Servlet can handle any http request");
		System.out.println(httpPacket.response());
		
	}	
}

class FtpServlet implements Servlet{

	@Override
	public void service() {
		System.out.println("FTP Servlet can transfer data in/out - system");
	}
	
}

class MailServlet implements Servlet{

	@Override
	public void service() {
		System.out.println("You can have pop3 or smtp implementation in Mail Servlet");
	}
	
}