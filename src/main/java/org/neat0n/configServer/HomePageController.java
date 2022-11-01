package org.neat0n.configServer;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HomePageController {
    @GetMapping
    ResponseEntity<String> home(){
        return ResponseEntity.ok("configserver homepage");
    }
}
