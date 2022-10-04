package dev.dmohindru.servicea.controller;

import dev.dmohindru.servicea.dto.ResponseDTO;
import dev.dmohindru.servicea.service.AppDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/servicea")
@RequiredArgsConstructor
public class ServiceAController {

    private final AppDetailsService appDetailsService;

    @GetMapping
    public ResponseEntity<ResponseDTO> getDetails() {
        return ResponseEntity.ok(appDetailsService.getAppDetails());
    }
}
