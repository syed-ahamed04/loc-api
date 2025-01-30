package com.shorewise.wiseconnect.lc;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/lc")
public class LoCController {

    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<LCResponse> createLC(@RequestBody LCRequest lcRequest) {
        // Generate a unique LC Number
        String lcNumber = "LC-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();

        // Return success response
        return ResponseEntity.ok(new LCResponse("Success", lcNumber));
    }
    

}
