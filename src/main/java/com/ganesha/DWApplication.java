package com.ganesha;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class DWApplication extends Application<DWConfiguration> {

    public static void main(final String[] args) throws Exception {
        new DWApplication().run(args);
    }

    @Override
    public String getName() {
        return "dropwizard-template";
    }

    @Override
    public void initialize(final Bootstrap<DWConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final DWConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
