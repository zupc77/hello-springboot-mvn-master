package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @RequestMapping("/")
  public String index() {
    String revision = System.getenv("K_REVISION");
    if (revision == null) {
      revision = "빌드번호: 2";
    }

    return String.format("** AWS빈즈톡 테스트 코드(w/Springboot) ===> %s", revision);
  }

}

