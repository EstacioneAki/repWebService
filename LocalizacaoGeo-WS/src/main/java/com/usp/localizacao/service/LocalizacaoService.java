package com.usp.localizacao.service;
import javax.servlet.http.HttpServlet;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/localizacaoGEO")
public class LocalizacaoService extends HttpServlet{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@GET
	@Produces("text/html")
	@Consumes("text/html")
	public String getLatitudeLongitude(){
		return "-23.4871494 | -47.4577477 ";
	}
	

}
