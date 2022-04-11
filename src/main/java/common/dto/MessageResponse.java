package common.dto;


import common.enums.MessageType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class MessageResponse {
    private final MessageType messageType;
    private final String message;
}