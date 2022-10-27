package org.soyphea.k8s.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.nio.file.Files;

@ConfigurationProperties(prefix = "user")
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserConfig {
    File tempDir;
    tempDir = File.createTempFile("", ".");
    tempDir.delete();
    tempDir.mkdir();  // Noncompliant
   
    String name;
    String blog;
}
