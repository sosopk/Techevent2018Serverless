package com.trivadis.te2018.serverless.easiest;

/**
 * Very simple Java Function only with one parameter
 *
 */
public class EasyLambda {
	
	/**
	 * Entry point for a FaaS
	 * @param s a string parameter
	 */
	public void handler(String s) {
        System.out.println("Hello " + s);
    }
	
}
