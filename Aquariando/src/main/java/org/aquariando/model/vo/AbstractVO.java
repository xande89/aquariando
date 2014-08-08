package org.aquariando.model.vo;

import javax.persistence.Column;


public abstract class AbstractVO 
{

	@Column(name="STATUS")
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
