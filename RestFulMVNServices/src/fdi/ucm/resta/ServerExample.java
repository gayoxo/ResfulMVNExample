package fdi.ucm.resta;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.json.JSONException;
import org.json.JSONObject;

@Path("/example")
public class ServerExample {

	
	@GET
	public Response convertFtoC() throws JSONException {
 
		JSONObject jsonObject = new JSONObject();
		Double fahrenheit = 98.24;
		Double celsius;
		celsius = (fahrenheit - 32) * 5 / 9;
		jsonObject.put("F Value", fahrenheit);
		jsonObject.put("C Value", celsius);
 
		String result = "@Produces(\"application/json\") Output: \n\nF to C Converter Output: \n\n" + jsonObject;
		return Response.status(200).entity(result).build();
	}
	
	@GET
	@Path ("/hello")
	 public Response convertFtoC2() throws JSONException {
		 
			JSONObject jsonObject = new JSONObject();
			Double fahrenheit = 98.24;
			Double celsius;
			celsius = (fahrenheit - 32) * 5 / 9;
			jsonObject.put("F Value", fahrenheit);
			jsonObject.put("C Value", celsius);
	 
			String result = "@Produces(\"application/json\") Output: \n\nF to C Converter Output: \n\n" + jsonObject;
			return Response.status(200).entity(result).build();
		}
	
	@GET
	@Path ("/hello/{param}")
	 public Response convertFtoC2Par(@PathParam("param") String msg) throws JSONException {
		 
			JSONObject jsonObject = new JSONObject();
			Double fahrenheit = 98.24;
			Double celsius;
			celsius = (fahrenheit - 32) * 5 / 9;
			jsonObject.put("F Value", fahrenheit);
			jsonObject.put("C Value", celsius);
	 
			String result = "@Produces(\"application/json\") Output: \n\n"+msg+": \n\n" + jsonObject;
			return Response.status(200).entity(result).build();
		}
	
	
	@GET
    @Path("/{param}")
    public Response getMsg(@PathParam("param") String msg) {
        String output = "Get:Jersey say : " + msg;
        return Response.status(200).entity(output).build();
    }

    @POST
    @Path("/{param}")
    public Response postMsg(@PathParam("param") String msg) {
        String output = "POST:Jersey say : " + msg;
        return Response.status(200).entity(output).build();
    }
    
    @POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTrackInJSON(Object track) {

		String result = "Track saved : " + track;
		return Response.status(201).entity(result).build();
		
	}
    
    @GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getTrackInJSON() {

		JSONObject jsonObject = new JSONObject();
		
		jsonObject.put("Title", "Enter Sandman");
		jsonObject.put("Singer", "Metallica");
		
		return Response.status(Status.OK).entity(jsonObject.toString()).build();

	}
	
}
