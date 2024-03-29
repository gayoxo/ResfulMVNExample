package fdi.ucm.resta;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.json.JSONException;
import org.json.JSONObject;

@Path("example2")
public class ServerExample2 {

	
	@GET
	@Produces("application/json")
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
	@Produces("application/json")
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
}
