/**
 * 
 */
package com.hula.services.impl;

import org.springframework.stereotype.Service;

import com.hula.services.IHomeService;

/**
 * @author asoilihi
 *
 */
@Service
public class HomeService implements IHomeService {

	/* (non-Javadoc)
	 * @see com.chahoula.services.IHomeService#getHome()
	 */
	@Override
	public String getHome() {
		// TODO Auto-generated method stub
		return "Hello Spring";
	}

}
