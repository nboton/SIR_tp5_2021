package kanban.rest;
import io.swagger.v3.oas.annotations.Parameter;
import kanban.dao.TableauDao;
import kanban.domain.Tableau;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/api")
@Produces({"application/json", "application/xml"})
public class TableauResource {

    @SuppressWarnings("unchecked")
    @GET
    @Path("tableau/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Tableau> getAllTableau()  {
        // return pet
        return new TableauDao().findAll();
    }

    @GET
    @Path("/tableau/{idTab}")
    public Tableau getTableauById(@PathParam("idTab") Long idTab)  {

        return new TableauDao().findById(idTab);
    }
    @POST
    @Path("/tableau/add")
    @Consumes("application/json")
    public Response addTableau(
            @Parameter(description = "Pet object that needs to be added to the store", required = true) Tableau tableau) {
        new TableauDao().save(tableau);
        return Response.ok().entity("SUCCESS").build();
    }

    @DELETE
    @Path("/tableau/delete/{idTab}")

    public void  deletetableau(@PathParam("idTab") Long idTab) {
        new TableauDao().deleteById(idTab);

    }
}
