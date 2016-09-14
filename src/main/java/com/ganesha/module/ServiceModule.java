package com.ganesha.module;

import com.codahale.metrics.MetricRegistry;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ganesha.DWConfiguration;
import com.ganesha.service.userService.IUserService;
import com.ganesha.service.userService.UserService;
import com.google.inject.AbstractModule;
import com.google.inject.Injector;
import com.google.inject.Provides;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by bhargav.naik on 14/09/16.
 */
@Singleton
public class ServiceModule extends AbstractModule {

    private final ObjectMapper objectMapper;
    private final MetricRegistry metricRegistry;

    @Inject
    public ServiceModule(ObjectMapper objectMapper, MetricRegistry metricRegistry) {
        this.objectMapper = objectMapper;
        this.metricRegistry = metricRegistry;
    }

    @Override
    protected void configure() {
        bind(ObjectMapper.class).toInstance(objectMapper);
    }

    @Provides
    @Singleton
    public MetricRegistry provideMetricRegistry() {
        return metricRegistry;
    }

    @Provides
    @Singleton
    public IUserService provideUserService(DWConfiguration configuration, Injector injector) {
        return injector.getInstance(UserService.class);
    }

}
