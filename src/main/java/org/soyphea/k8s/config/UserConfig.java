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
    URL url = new URL("https://example.org/");
    HttpsURLConnection urlConnection = (HttpsURLConnection)url.openConnection();
    urlConnection.setHostnameVerifier(new HostnameVerifier() {
      @Override
      public boolean verify(String requestedHost, SSLSession remoteServerSession) {
        return true;  // Noncompliant
      }
    });
    InputStream in = urlConnection.getInputStream();
   
    String name;
    String blog;
}
