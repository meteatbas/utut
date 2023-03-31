//package com.academicerp.backend.Controller;
//
////import com.academicerp.backend.Bean.Student;
//import com.academicerp.backend.DAO.AdminDAO;
////import com.academicerp.backend.DAO.DomainsDAO;
////import com.academicerp.backend.DAO.StudentDAO;
//import jakarta.ws.rs.*;
//import jakarta.ws.rs.core.MediaType;
//import jakarta.ws.rs.core.Response;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@Path("/")
//public class RootPathController {
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response rootPath(){
//        return Response.ok().entity("Welcome!").build();
//    }
//
//
//    @POST
//    @Path("/add")
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response add(Admin admin) {
//        AdminDAO dao = new AdminDAO();
//        if(dao.addAdmin(admin)){
//            Map<String,String> mp = new HashMap<>();
//            mp.put("result", "Success");
//            return Response.status(Response.Status.OK).entity(mp).build();
//        }
//        else{
//            Map<String,String> mp = new HashMap<>();
//            mp.put("result", "fail");
//            return Response.status(203).entity(mp).build();
//        }
//    }
//}
