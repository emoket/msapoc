package bing;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RateLimitController {

    @RequestMapping(path = "/services", produces = MediaType.TEXT_PLAIN_VALUE)
    @GetMapping("/serviceA")
    public String serviceA() {
        return "serviceA";
    }

    @GetMapping("/serviceB")
    public String serviceB() {
        return "serviceB";
    }

    @GetMapping("/serviceC/{paramName}")
    public String serviceD(@PathVariable String paramName) {
        return "seriviceC " + paramName;
    }
}
