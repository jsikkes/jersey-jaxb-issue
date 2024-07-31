package com.acme.jersey.jaxb.issue;

import com.acme.jersey.jaxb.issue.client.XmlNotesApiProducer;
import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;
import jakarta.enterprise.inject.spi.CDI;

public class App {

    public static void main(String[] args) {

        SeContainerInitializer seContainerInitializer = SeContainerInitializer.newInstance();
        seContainerInitializer.disableDiscovery();
        seContainerInitializer.addBeanClasses(CdiSeApplication.class, XmlNotesApiProducer.class);

        try(SeContainer container = seContainerInitializer.initialize()) {
            CdiSeApplication app = CDI.current().select(CdiSeApplication.class).get();
            app.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}