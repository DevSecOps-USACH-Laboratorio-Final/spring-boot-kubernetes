package org.soyphea.k8s.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.crypto.Cipher;


@ConfigurationProperties(prefix = "user")
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor




public class UserConfig {
    
    public static void procesa() {
    
    try
        {
            Cipher c1 = Cipher.getInstance("DES"); // Noncompliant: DES works with 56-bit keys allow attacks via exhaustive search
        }   
    catch(Exception e)
        {
        }
    }
    
    String name;
    String blog;
}
