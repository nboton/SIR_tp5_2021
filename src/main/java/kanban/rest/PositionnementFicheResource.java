package kanban.rest;

import io.swagger.v3.oas.annotations.Parameter;
import kanban.dao.FicheDao;
import kanban.dao.PositionnementFicheDao;
import kanban.domain.Fiche;
import kanban.domain.PositionnementFiche;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/api")
@Produces({"application/json", "application/xml"})
public class PositionnementFicheResource {
    @SuppressWarnings("unchecked")
    @GET
    @Path("PositionnementFiche/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<PositionnementFiche> getAllPositionnementFiche() {
        // return pet
        return new PositionnementFicheDao().findAll();
    }

    @GET
    @Path("/PositionnementFiche/{idPfich}")
    public PositionnementFiche getPositionnementFicheById(@PathParam("idPfich") Long idPfich) {

        return new PositionnementFicheDao().findById(idPfich);
    }

    @POST
    @Path("/PositionnementFiche/add")
    @Consumes("application/json")
    public Response addPositionnementFiche(
            @Parameter(description = "Pet object that needs to be added to the store", required = true) PositionnementFiche position) {
        new PositionnementFicheDao().save(position);
        return Response.ok().entity("SUCCESS").build();
    }

    @DELETE
    @Path("/PositionnementFiche/delete/{idPfich}")

    public void deletePositionnementFiche(@PathParam("idPfich") Long idPfich) {
        new PositionnementFicheDao().deleteById(idPfich);

    }
}
