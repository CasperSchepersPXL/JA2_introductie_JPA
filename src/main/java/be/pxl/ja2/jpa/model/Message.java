package be.pxl.ja2.jpa.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Message {

	@Id
	private long id;
	private String text;

	public Message() {
		// JPA only
	}

	public Message(long messageId, String text) {
		this.id = messageId;
		this.text = text;
	}

	public long getId() {
		return id;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}
}