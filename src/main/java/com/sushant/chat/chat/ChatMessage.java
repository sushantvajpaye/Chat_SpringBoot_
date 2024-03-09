package com.sushant.chat.chat;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatMessage {

    private MessageType type;
    private String content;
    private String sender;
	public static Object builder() {
		// TODO Auto-generated method stub
		return null;
	}
	public MessageType getType() {
		return type;
	}
	public void setType(MessageType type) {
		this.type = type;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getSender() {
		return sender;
	}
	public ChatMessage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setSender(String sender) {
		this.sender = sender;
	}

}
