package com.acme.jersey.jaxb.issue.client;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Disposes;
import jakarta.enterprise.inject.Produces;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.WebTarget;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.JerseyClientBuilder;
import org.glassfish.jersey.client.proxy.WebResourceFactory;

@ApplicationScoped
public class XmlNotesApiProducer {

    @Produces
    public Client createClient() {
        ClientConfig config = new ClientConfig();
        return JerseyClientBuilder.newClient(config);
    }

    public void disposeClient(@Disposes Client client) {
        client.close();
    }

    @Produces
    public XmlNotesApi createExampleApi(Client client) {
        WebTarget target = client.target("https://www.w3schools.com");
        return WebResourceFactory.newResource(XmlNotesApi.class, target);
    }
}
