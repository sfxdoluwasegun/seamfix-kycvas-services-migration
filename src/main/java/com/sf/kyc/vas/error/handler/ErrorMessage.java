package com.sf.kyc.vas.error.handler;


import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.Response;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ErrorMessage {
	
	/** contains the same HTTP Status code returned by the server */
	@XmlElement(name = "Status")
	int status;
	
	/** application specific error code */
	@XmlElement(name = "Code")
	int code;
	
	/** message describing the error*/
	@XmlElement(name = "Message")
	String message;
		
	/** link point to page where the error message is documented */
	@XmlElement(name = "Link")
	String link;
	
	/** extra information that might useful for developers */
	@XmlElement(name = "DeveloperMessage")
	String developerMessage;	

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDeveloperMessage() {
		return developerMessage;
	}

	public void setDeveloperMessage(String developerMessage) {
		this.developerMessage = developerMessage;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}
	
	
	public ErrorMessage(NotFoundException ex){
		this.status = Response.Status.NOT_FOUND.getStatusCode();
		this.message = ex.getMessage();
		this.link = "";		
	}

	public ErrorMessage() {}
}
