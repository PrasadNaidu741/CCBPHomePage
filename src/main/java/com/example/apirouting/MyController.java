/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.GetMapping;
 * import org.springframework.web.bind.annotation.RestController;
 * 
 */

package com.example.apirouting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/")
    public String getApiRouting() {
        return "Home Page";
    }
}
