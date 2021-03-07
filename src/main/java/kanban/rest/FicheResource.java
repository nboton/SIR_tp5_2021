package kanban.rest;

import io.swagger.v3.oas.annotations.Parameter;
import kanban.dao.FicheDao;
import kanban.domain.Fiche;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/api")
@Produces({"application/json", "application/xml"})
public class FicheResource {
    @SuppressWarnings("unchecked")
    @GET
    @Path("fiche/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Fiche> getAllfiche()  {
        // return pet
        return new FicheDao().findAll();
    }

    @GET
    @Path("/fiche/{idfich}")
    public Fiche getFicheById(@PathParam("idfich") Long idfich)  {

        return new FicheDao().findById(idfich);
    }
    @POST
    @Path("/fiche/add")
    @Consumes("application/json")
    public Response addFiche(
            @Parameter(description = "Pet object that needs to be added to the store", required = true) Fiche fiche) {
        new FicheDao().save(fiche);
        return Response.ok().entity("SUCCESS").build();
    }

    @DELETE
    @Path("/utilisateur/delete/{userId}")

    public void  deleteFiche(@PathParam("idfich") Long idfich) {
        new FicheDao().deleteById(idfich);

    }
    @POST
    @Path("/fiche/update")
    @Consumes("application/json")
    public Response updateFiche(
            @Parameter(description = "Pet object that needs to be added to the store", required = true) Fiche fiche) {
        new FicheDao().update(fiche);
        return Response.ok().entity("SUCCESS").build();
    }
}
