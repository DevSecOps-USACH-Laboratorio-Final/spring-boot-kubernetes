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
    
    SecureRandom sr = new SecureRandom();
    sr.setSeed(123456L); // Noncompliant
    int v = sr.next(32);

    sr = new SecureRandom("abcdefghijklmnop".getBytes("us-ascii")); // Noncompliant
    v = sr.next(32);
   
    
    String name;
    String blog;
}
