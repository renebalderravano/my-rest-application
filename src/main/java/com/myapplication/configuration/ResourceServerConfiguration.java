package com.myapplication.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

@Configuration
@EnableResourceServer
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {

    private static final String RESOURCE_ID = "resource-server-rest-api";
    private static final String SECURED_READ_SCOPE = "#oauth2.hasScope('read')";
    private static final String SECURED_WRITE_SCOPE = "#oauth2.hasScope('write')";
<<<<<<< HEAD
    private static final String SECURED_PATTERN = "/publication/**";
    private static final String SECURED_PATTERN_TWO= "/customer/**";
=======
    private static final String SECURED_PATTERN = "/**";
>>>>>>> a253bca23852c8443db7631db84154760796a46a

    @Override
    public void configure(ResourceServerSecurityConfigurer resources) {
        resources.resourceId(RESOURCE_ID);
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
<<<<<<< HEAD
        http.cors().and().csrf(). disable().requestMatchers()        
        .antMatchers(SECURED_PATTERN,SECURED_PATTERN_TWO).and().authorizeRequests()
        .antMatchers(HttpMethod.POST, SECURED_PATTERN).access(SECURED_WRITE_SCOPE)
        .antMatchers(HttpMethod.GET, SECURED_PATTERN).access(SECURED_READ_SCOPE)
        .antMatchers(HttpMethod.POST, SECURED_PATTERN_TWO).access(SECURED_WRITE_SCOPE)
        .antMatchers(HttpMethod.GET, SECURED_PATTERN_TWO).access(SECURED_READ_SCOPE)
        .anyRequest().access(SECURED_READ_SCOPE);
        
      
=======
    	
    	 http.cors().and().csrf().disable();
        http.requestMatchers()
                .antMatchers(SECURED_PATTERN).and()
            .authorizeRequests()
                .antMatchers(HttpMethod.POST, SECURED_PATTERN).access(SECURED_WRITE_SCOPE)          
                .anyRequest()
                .authenticated()
                .and()
                .formLogin();
>>>>>>> a253bca23852c8443db7631db84154760796a46a
    }
}
