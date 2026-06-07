package com.chat.app.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ChatMessage {
    private Long id;
    private String sender;
    private String content;
}
