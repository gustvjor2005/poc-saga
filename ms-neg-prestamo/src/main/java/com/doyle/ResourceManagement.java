package com.doyle;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.doyle.model.Prestamo;

@Path("/process")
public class ResourceManagement {

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response generate() {
				
		Prestamo obj = new Prestamo();
		obj.setTipo("RCS");
		obj.setMonto((float)123.2);
		
		return Response.ok().entity(obj).build();
	}
}
