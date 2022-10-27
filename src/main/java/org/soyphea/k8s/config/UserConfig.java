package org.soyphea.k8s.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "user")
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserConfig {
    String className = System.getProperty("messageClassName");
    Class clazz = Class.forName(className);  // Noncompliant
    String name;
    String blog;
}
