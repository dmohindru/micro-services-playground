package dev.dmohindru.serviceb.controller;

import dev.dmohindru.serviceb.dto.ResponseDTO;
import dev.dmohindru.serviceb.service.AppDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/serviceb")
@RequiredArgsConstructor
public class ServiceBController {
    private final AppDetailsService appDetailsService;

    @GetMapping
    public ResponseEntity<ResponseDTO> getDetails() {
        return ResponseEntity.ok(appDetailsService.getAppDetails());
    }
}
