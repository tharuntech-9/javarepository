package com.bindinguri.resources;

import java.security.SecureRandom;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/policy")
public class Policy {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getPolicyDetails(@QueryParam("/policyno") String policyNo) {
		String policyDetails=null;
		
		policyDetails = "{'name':'john','policy name':'lifetime plan', 'email': 'john1@gmail.com' , 'mobileno' : '7780252523' }";
		
		return policyDetails;	
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/amount")
	public double getPremiumAmount(@QueryParam("/policyno") String policyNo) {
		
		return new SecureRandom().nextDouble()*10000;
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("nextdate")
	public String getNextDueDate(@QueryParam("/policyno") String policyNo) {
		
		return "11-08-2023";
	}

}
