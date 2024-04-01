package com.chatservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ChatMessage {
    public enum MessageType {
        ENTER, TALK, QUIT
    }

    private MessageType messageType;
    private Long chatRoomId;
    private Long senderId;
    private String message;
}
