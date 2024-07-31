package com.acme.jersey.jaxb.issue.client;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

public interface XmlNotesApi {

    @GET
    @Path("xml/note.xml")
    @Produces(MediaType.APPLICATION_XML)
    XmlNote getNote();

}
