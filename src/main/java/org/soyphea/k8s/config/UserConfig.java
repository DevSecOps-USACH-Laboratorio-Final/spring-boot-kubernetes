package org.soyphea.k8s.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/")
public void index(HttpServletResponse res, String value) {
    res.setHeader("Set-Cookie", value);  // Noncompliant
    Cookie cookie = new Cookie("jsessionid", value);  // Noncompliant
    res.addCookie(cookie);
}

@ConfigurationProperties(prefix = "user")
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserConfig {
    String name;
    String blog;
}
