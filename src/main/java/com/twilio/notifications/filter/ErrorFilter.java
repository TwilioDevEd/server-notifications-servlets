package com.twilio.notifications.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "ErrorFilter", urlPatterns = {"/launch"})
public class ErrorFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String errorMessage = "Ouch";
        try {
            chain.doFilter(request, response);
        } catch (Throwable throwable) {
            errorMessage = throwable.getMessage();
        }

        Object error = errorMessage;
        request.setAttribute("error", error);
        request.getRequestDispatcher("error.jsp").forward(request, response);
    }

    public void destroy() {
    }
}
