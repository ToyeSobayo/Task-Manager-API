package co.taskmanager.api.controller;

import co.taskmanager.api.request.RegisterRequest;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

// Marks the class as a REST API controller
@RestController



public class RegisterController {

    // Just a little test to make sure we're good
    @GetMapping("/")
    public @ResponseBody String index() {
        return "Hi";
    }

    // Maps HTTP POST requests to a method
    @PostMapping("/register")
    public ResponseEntity<String> register(@Valid @RequestBody RegisterRequest request) {



        return ResponseEntity.ok("Successfully Registered");
    }
}
