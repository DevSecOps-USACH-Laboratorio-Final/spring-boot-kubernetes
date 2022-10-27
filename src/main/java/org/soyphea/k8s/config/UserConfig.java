package org.soyphea.k8s.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import org.h2.security.SHA256;

String inputString = "s3cr37";
byte[] key         = inputString.getBytes();

SHA256.getHMAC(key, message);  // Noncompliant

@ConfigurationProperties(prefix = "user")
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserConfig {
    String name;
    String blog;
}
