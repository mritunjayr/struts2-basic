package com.ibm.helloworld.action;

import com.ibm.helloworld.model.MessageStore;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	private MessageStore messageStore;
	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String execute() throws Exception {
		messageStore = new MessageStore();
		if (userName != null) {
			messageStore.setMessage(messageStore.getMessage() + " " + userName);

		}
		return SUCCESS;
	}

	public MessageStore getMessageStore() {
		return messageStore;
	}

}
