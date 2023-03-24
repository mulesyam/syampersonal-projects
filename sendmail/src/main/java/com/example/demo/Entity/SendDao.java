package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="receivemail")
public class SendDao {
	@Id

	private String recipient;
	

	private String msgbody;
	
	private String subject;
	

	private String attachment;
	    
		public String getRecipient() {
			return recipient;
		}
		public void setRecipient(String recipient) {
			this.recipient = recipient;
		}
		public String getMsgBody() {
			return msgbody;
		}
		public void setMsgBody(String msgBody) {
			this.msgbody = msgBody;
		}
		public String getSubject() {
			return subject;
		}
		public void setSubject(String subject) {
			this.subject = subject;
		}
		public String getAttachment() {
			return attachment;
		}
		public void setAttachment(String attachment) {
			this.attachment = attachment;
		}
		
		
		@Override
		public String toString() {
			return "EmailDetails [recipient=" + recipient + ", msgBody=" + msgbody + ", subject=" + subject
					+ ", attachment=" + attachment + "]";
		}
		public SendDao() {
			super();
			
		}
		
		

}