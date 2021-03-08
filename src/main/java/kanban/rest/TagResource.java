package kanban.rest;

import io.swagger.v3.oas.annotations.Parameter;
import kanban.dao.FicheDao;
import kanban.dao.TableauDao;
import kanban.dao.TagDao;
import kanban.domain.Fiche;
import kanban.domain.Tableau;
import kanban.domain.Tag;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/api")
@Produces({"application/json", "application/xml"})
public class TagResource {
    @SuppressWarnings("unchecked")
    @GET
    @Path("tag/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Tag> getAllTag()  {
        // return pet
        return new TagDao().findAll();
    }

    @GET
    @Path("/tag/{idTag}")
    public Tag getTagById(@PathParam("idtab") Long idTag)  {

        return new TagDao().findById(idTag);
    }
    @POST
    @Path("/tag/add")
    @Consumes("application/json")
    public Response addTag(
            @Parameter(description = "", required = true) Tag tag) {
        new TagDao().save(tag);
        return Response.ok().entity("SUCCESS").build();
    }

    @DELETE
    @Path("/tag/delete/{idTag}")

    public void  deleteTag(@PathParam("idTag") Long idTag) {
        new TagDao().deleteById(idTag);

    }

    @POST
    @Path("/tag/update")
    @Consumes("application/json")
    public Response updateTag(
            @Parameter(description = "", required = true) Tag tag) {
        new TagDao().update(tag);
        return Response.ok().entity("SUCCESS").build();
    }
}
