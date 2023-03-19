package com.example.demo.EmployeeDao;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="receivedmail")
public class EmailDetails {
	@Id
	    private String recipient;
	    private String msgBody;
	    private String subject;
	    private String attachment;
		public String getRecipient() {
			return recipient;
		}
		public void setRecipient(String recipient) {
			this.recipient = recipient;
		}
		public String getMsgBody() {
			return msgBody;
		}
		public void setMsgBody(String msgBody) {
			this.msgBody = msgBody;
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
			return "EmailDetails [recipient=" + recipient + ", msgBody=" + msgBody + ", subject=" + subject
					+ ", attachment=" + attachment + "]";
		}
		public EmailDetails() {
			super();
			
		}
		
		

}
