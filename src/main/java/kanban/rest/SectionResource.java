package kanban.rest;


import io.swagger.v3.oas.annotations.Parameter;
import kanban.dao.SectionDao;
import kanban.domain.Pet;
import kanban.domain.Section;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/api")
@Produces({"application/json", "application/xml"})
public class SectionResource {

    @SuppressWarnings("unchecked")
    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Section> getAllSection()  {
        // return pet
        return new  SectionDao().findAll();
    }

    @GET
    @Path("/section/{sectId}")
    public Section getSectionById(@PathParam("sectId") Long sectId)  {

        return new SectionDao().findById(sectId);
    }
    @POST
    @Path("/section/add")
    @Consumes("application/json")
    public Response addsection(
            @Parameter(description = "Pet object that needs to be added to the store", required = true) Section sect) {
        new SectionDao().save(sect);
        return Response.ok().entity("SUCCESS").build();
    }

    @DELETE
    @Path("/section/delete/{sectId}")

    public void  deleteSection(@PathParam("sectId") Long sectId) {
        new SectionDao().deleteById(sectId);

    }
}
