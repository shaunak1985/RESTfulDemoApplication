package com.howtodoinjava.restful;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/user-management")
public class UserManagementModule
{
	// created by shaunak meghavala
	//sfsffsfsf
	// done from local
	// test one
	@GET
	@Path("/users")
	public Response getAllUsers()
	{
		String result = "<h1>RESTful Demo Application</h1>In real world application, a collection of users will be returned !!";
		return Response.status(200).entity(result).build();
	}
}
