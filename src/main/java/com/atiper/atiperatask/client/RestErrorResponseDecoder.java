package com.atiper.atiperatask.client;

import com.atiper.atiperatask.model.exception.ErrorResponse;
import com.atiper.atiperatask.model.exception.NotFoundException;
import com.atiper.atiperatask.model.exception.RestClientException;
import com.fasterxml.jackson.databind.ObjectMapper;
import feign.Response;
import feign.codec.ErrorDecoder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class RestErrorResponseDecoder implements ErrorDecoder {
    private final ObjectMapper objectMapper;

    @Override
    public Exception decode(String methodKey, Response response) {
        ErrorResponse errorResponse;
        try {
            errorResponse = objectMapper.readValue(response.body().asInputStream(), ErrorResponse.class);
        } catch (Exception ex) {
            log.error("ActionLog.RestErrorResponseDecoder.error %s", ex.getMessage());
            throw new RestClientException(String.valueOf(response.status()), response.reason());
        }
        switch (response.status()) {
            case 404:
                return new NotFoundException(errorResponse.getCode(), errorResponse.getMessage());
            default:
                return new RestClientException(errorResponse.getCode(), errorResponse.getMessage());
        }
    }
}
