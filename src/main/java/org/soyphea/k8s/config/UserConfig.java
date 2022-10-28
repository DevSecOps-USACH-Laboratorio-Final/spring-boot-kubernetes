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
            Cipher c1 = Cipher.getInstance("DES/ECB/PKCS5Padding"); // vulnerability
        }   
    catch(Exception e)
        {
        }
    }
    
    String name;
    String blog;
}
