package com.ganesha;

import com.ganesha.module.ServiceModule;
import com.google.inject.Stage;
import com.hubspot.dropwizard.guice.GuiceBundle;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import java.text.SimpleDateFormat;

public class DWApplication extends Application<DWConfiguration> {

    private GuiceBundle<DWConfiguration> guiceBundle;
    public static final String ISO8601_FORMAT = "yyyy-MM-dd'T'HH:mm:ss";

    public static void main(final String[] args) throws Exception {
        new DWApplication().run(args);
    }

    @Override
    public String getName() {
        return "dropwizard-template";
    }

    @Override
    public void initialize(final Bootstrap<DWConfiguration> bootstrap) {

        ServiceModule module = new ServiceModule(bootstrap.getObjectMapper(), bootstrap.getMetricRegistry());
        guiceBundle = GuiceBundle.<DWConfiguration>newBuilder()
                .addModule(module)
                .enableAutoConfig(getClass().getPackage().getName())
                .setConfigClass(DWConfiguration.class)
                .build(Stage.DEVELOPMENT);

        bootstrap.addBundle(guiceBundle);
        bootstrap.getObjectMapper().setDateFormat(new SimpleDateFormat(ISO8601_FORMAT));
    }

    @Override
    public void run(final DWConfiguration configuration,
                    final Environment environment) {
    }

}
