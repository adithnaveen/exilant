package com.exilant.facade;

public class FacadeClient {
	public static void main(String[] args) {
		
		HttpPacket httpPacket = new HttpPacket();
		httpPacket.message = "Hello World";
		
		
		ChooseServlet facade = new ChooseServlet();
		
		facade.serveFtpServlet();
		
		facade.serveHttpServlet();
		facade.serveHttpServlet(httpPacket);
		
		facade.serveMailServlet();
	}
}
