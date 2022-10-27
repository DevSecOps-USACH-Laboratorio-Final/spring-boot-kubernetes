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
    String name;
    String blog;
}

protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
  String json = "{\"key\":\""+req.getParameter("value")+"\"}";
  FileOutputStream fos = new FileOutputStream("output.json");
  fos.write(json.getBytes(Charset.forName("UTF-8")));  // Noncompliant
}
