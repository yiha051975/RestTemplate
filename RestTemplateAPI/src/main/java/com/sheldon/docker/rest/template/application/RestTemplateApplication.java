package com.sheldon.docker.rest.template.application;

import com.sheldon.docker.rest.template.resources.HelloWorldResource;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("")
public class RestTemplateApplication extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classSet = new HashSet<>();
        classSet.add(HelloWorldResource.class);

        return classSet;
    }
}
