package com.zlebank.zplatform.business.exception;

import com.zlebank.zplatform.business.commons.exception.AbstractRealnameDescException;

public class BusinessCoopInstException extends AbstractRealnameDescException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String code;
	
	public BusinessCoopInstException() {
		super();
	}
	public BusinessCoopInstException(String code,Object ... para ) {
        this.params = para;
        this.code = code;
    }

	public BusinessCoopInstException(String code) {
		super();
		this.code = code;
	}


	@Override
	public String getCode() {
		return this.code;
	}

}
