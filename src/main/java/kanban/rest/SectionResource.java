package kanban.rest;


import io.swagger.v3.oas.annotations.Parameter;
import kanban.domain.Pet;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/api")
@Produces({"application/json", "application/xml"})
public class SectionResource {



    @GET
    @Path("/")
    public List<Pet> getAll()  {
        // return pet
        return new ArrayList<>();
    }

    @GET
    @Path("/{petId}")
    public Pet getPetById(@PathParam("petId") Long petId)  {
        // return pet
        return new Pet();
    }
    @POST
    @Consumes("application/json")
    public Response addPet(
            @Parameter(description = "Pet object that needs to be added to the store", required = true) Pet pet) {
        // add pet
        return Response.ok().entity("SUCCESS").build();
    }
}
