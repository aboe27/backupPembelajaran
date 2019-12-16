package com.example.btpns.trainig.latihan1.config;


import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;

@Component
public class CustomSuccessHandler extends SimpleUrlAuthenticationSuccessHandler{
    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

    @Override
    protected void handle(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
    throws IOException,ServletException {

        String targetUrl = determineTargetUrl(authentication);

        if(response.isCommitted()){
            System.out.println("can't redirect");
            return;
        }

        redirectStrategy.sendRedirect(request,response,targetUrl);

    }

    protected String determineTargetUrl(Authentication authentication){
        String url ="";
        Collection<? extends GrantedAuthority> grantedAuthorities = authentication.getAuthorities();
        String role ="";

        for(GrantedAuthority grantedAuthorityTemp: grantedAuthorities){
            role = grantedAuthorityTemp.getAuthority();
        }

        url = "/admin";

        return url;
    }
}
