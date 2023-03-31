package com.academicerp.backend.Controller;

//import com.academicerp.backend.Bean.Domains;
//import com.academicerp.backend.DAO.DomainsDAO;
import com.academicerp.backend.DAO.PostDAO;
import com.academicerp.backend.Dto.BookDTO;
import com.academicerp.backend.Dto.CarPersonRequestDTO;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Path("/domains")
@JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.PROPERTY, property="@class")
public class DomainsController {
//    private DomainsDAO DomainDAOobj;

    private PostDAO postDAO;


    DomainsController() {
//        DomainDAOobj = new DomainsDAO();
        postDAO = new PostDAO();
    }

//    @GET
//    @Produces("application/json")
//    public Response getAllDom() {
//        return Response.ok().entity(DomainDAOobj.getAllDomains()).build();
//    }

//
//    @POST
//    @Path("/add")
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response add(Domains d) {
//        DomainsDAO dao = new DomainsDAO();
//        if (dao.addDomain(d)) {
//            Map<String, String> mp = new HashMap<>();
//            mp.put("result", "Success");
//            return Response.status(Response.Status.OK).entity(mp).build();
//        } else {
//            Map<String, String> mp = new HashMap<>();
//            mp.put("result", "fail");
//            return Response.status(203).entity(mp).build();
//        }
//    }
//
//    @POST
//    @Path("/update/{id}")
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response update(Domains d, @PathParam("id") final Integer id) {
//        DomainsDAO dao = new DomainsDAO();
//        if (dao.updateDomian(d, id)) {
//            Map<String, Object> mp = new HashMap<>();
//            mp.put("result", "Success");
//            mp.put("updatedDomain", d);
//
//            return Response.status(Response.Status.OK).entity(mp).build();
//        } else {
//            Map<String, String> mp = new HashMap<>();
//            mp.put("result", "fail");
//            mp.put("input", d.toString());
//            return Response.status(203).entity(mp).build();
//        }
//    }


    @Path("/getPosts")
    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public List<BookDTO> getDomains() {

        List<BookDTO> books=this.postDAO.getPosts();
//        this.bookDAO.findCategoryByCode();

        //List<Book> books=this.bookDAO.getAllBook();
//        List<DomainsDTO> d = this.DomainDAOobj.getAllDomainds();
//        s.get(0).get
        return books;
    }

    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response add(CarPersonRequestDTO carPersonRequestDTO) {
        this.postDAO.getAllPost(carPersonRequestDTO);
//        this.bookDAO.addBook(d);

        return Response.accepted().build();
    }
}
