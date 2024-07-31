## About

This repository contains a Cdi2 application which demonstrates a dependency injection issue
in the jersey-media-jaxb library from version 3.1.2 and higher.


1. It instantiates a CDI Container
2. Produces a default Jersey Client
3. Produces a WebResource / Proxy client using the interface XmlNotesApi
4. Injects the Proxy Client into the application (CdiSeApplication)
5. Invokes getNote() to fetch https://www.w3schools.com/xml/note.xml and parses the xml response using jaxb

Successful output:

    XmlNote{to='Tove', from='Jani', heading='Reminder', body='Don't forget me this weekend!'}

## Notes

The settings.gradle file contains jersey, jaxb, weld library definitions and versions. For the libraries that are
actually used in this demo; look at the [build.gradle]build.gradle dependencies section.

To change the demo from non-working to working explicitly set the version of jersey-media-jaxb library used to 3.1.1
in the [settings.gradle]settings.gradle file 

    - .versionRef('jerseyVersion')
    + .version('3.1.1') 

