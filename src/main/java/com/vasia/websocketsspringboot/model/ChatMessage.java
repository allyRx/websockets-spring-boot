package com.vasia.websocketsspringboot.model;


import lombok.Data;

@Data
public class ChatMessage {

    private String content;
    private String sender;
    private MessageType type;
    private String time;

    private enum MessageType {
        CHAT,
        JOIN,
        LEAVE
    }
}
