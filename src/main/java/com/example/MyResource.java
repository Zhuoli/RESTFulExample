package com.example;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("asyncBuild")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Path("/getit")
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return String.format("Got it! %s \n", "as");
    }

    @POST
    @Path("/doPost")
    @Produces(MediaType.APPLICATION_JSON)
    public Boolean add(@FormParam("name") String name) {
        // TODO save
        return true;
    }
}
