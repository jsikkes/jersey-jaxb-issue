package com.acme.jersey.jaxb.issue;

import com.acme.jersey.jaxb.issue.client.XmlNote;
import com.acme.jersey.jaxb.issue.client.XmlNotesApi;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class CdiSeApplication {
    @Inject
    private XmlNotesApi notesApi;

    void run() {
       XmlNote note = notesApi.getNote();
       System.out.println(note.toString());
    }

}
