package org.soyphea.k8s.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


import javax.persistence.Entity;

@Entity
public class Wish {
  Long productId;
  Long quantity;
  Client client;
}

@Entity
public class Client {
  String clientId;
  String name;
  String password;
}

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller


@ConfigurationProperties(prefix = "user")
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserConfig {
    @PostMapping(path = "/saveForLater")
      public String saveForLater(Wish wish) {
        session.save(wish);
      }

      @RequestMapping(path = "/saveForLater", method = RequestMethod.POST)
      public String saveForLater(Wish wish) {
        session.save(wish);
      } 
   
    String name;
    String blog;
}
