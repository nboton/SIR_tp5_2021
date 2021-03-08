package kanban.rest;
import io.swagger.v3.oas.annotations.Parameter;
import kanban.dao.UtilisateurDao;
import kanban.domain.Utilisateur;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/api")
@Produces({"application/json", "application/xml"})
public class UtilisateurResource {

    @SuppressWarnings("unchecked")
    @GET
    @Path("utilisateur/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Utilisateur> getAllUtilisateur()  {
        // return pet
        return new UtilisateurDao().findAll();
    }

    @GET
    @Path("/utilisateur/{userId}")
    public Utilisateur getUtilisateurById(@PathParam("userId") String userId)  {

        return new UtilisateurDao().findById(userId);
    }
    @POST
    @Path("/utilisateur/add")
    @Consumes("application/json")
    public Response addUtilisateur(
            @Parameter(description = "", required = true) Utilisateur user) {
        new UtilisateurDao().save(user);
        return Response.ok().entity("SUCCESS").build();
    }

    @DELETE
    @Path("/utilisateur/delete/{userId}")

    public void  deleteUtilisateur(@PathParam("userId")  String userId) {
        new UtilisateurDao().deleteById(userId);

    }
}
