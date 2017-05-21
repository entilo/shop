package com.shop.www.service.impl;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shop.www.pojo.User;
import com.shop.www.service.UserService;

@Path("/userService")
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
// @Produces( { MediaType.APPLICATION_XML })
public class UserServiceImpl implements UserService {

	@Override
	@RequestMapping(value = "/getUser/{id}", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON,
			MediaType.APPLICATION_XML })
	public User getUserBuId(@PathParam("id") Integer Id) {
		System.out.println("ids is" + Id);
		return null;
	}

}
