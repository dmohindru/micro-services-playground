package dev.dmohindru.servicea.service;

import dev.dmohindru.servicea.config.AppProperties;
import dev.dmohindru.servicea.dto.ResponseDTO;
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
