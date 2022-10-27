package org.soyphea.k8s.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.net.ssl.SSLContext

@ConfigurationProperties(prefix = "user")
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserConfig {
    
    context = SSLContext.getInstance("TLSv1.1"); // Noncompliant
   
    String name;
    String blog;
}
