package com.shop.www.webservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.shop.www.pojo.User;

@Path("/userService")
@Produces({MediaType.APPLICATION_XML })
public interface UserService {

	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Path("/searchUser/{id}")
	User getUserBuId(@PathParam("id")Integer Id);
}
