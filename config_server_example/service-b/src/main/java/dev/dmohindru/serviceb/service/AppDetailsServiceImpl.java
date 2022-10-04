package dev.dmohindru.serviceb.service;

import dev.dmohindru.serviceb.config.AppProperties;
import dev.dmohindru.serviceb.dto.ResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppDetailsServiceImpl implements AppDetailsService{

    private final AppProperties appProperties;

    @Override
    public ResponseDTO getAppDetails() {

        return ResponseDTO.builder()
                .appName(appProperties.getName())
                .encryptedMessage(appProperties.getEncryptedMessage())
                .message(appProperties.getMessage())
                .build();
    }
}
