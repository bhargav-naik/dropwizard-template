package com.ganesha;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class dropwizard-templateApplication extends Application<dropwizard-templateConfiguration> {

    public static void main(final String[] args) throws Exception {
        new dropwizard-templateApplication().run(args);
    }

    @Override
    public String getName() {
        return "dropwizard-template";
    }

    @Override
    public void initialize(final Bootstrap<dropwizard-templateConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final dropwizard-templateConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
