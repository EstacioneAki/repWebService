package com.usp.localizacao.service;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/localizacaoGEO")
public class LocalizacaoService {

	public LocalizacaoService() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@GET
	@Path("/getLocalizacao/")
	@Produces(MediaType.APPLICATION_XML)
	@Consumes("application/xml")
	public String getLatitudeLongitude(){
		return "Sucesso";
	}
	

}
