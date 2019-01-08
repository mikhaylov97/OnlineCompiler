package com.company.online.compiler.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * Class exists for configuring web app.
 * There we set the Application's resource(css, js, font, etc.) folder,
 * viewResolver bean for mapping the app views and so on.
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.company.online.compiler")
public class WebConfig extends WebMvcConfigurerAdapter {

    /**
     * Method allow us to set app's resource folder
     * @param registry - provided parameter for setting resource handlers
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    /**
     * Method register viewResolver bean in spring context.
     * It used for mapping views to strings.
     * @return ViewResolver.
     */
    @Bean(name = "viewResolver")
    public ViewResolver getViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        resolver.setViewClass(JstlView.class);
        return resolver;
    }
}
