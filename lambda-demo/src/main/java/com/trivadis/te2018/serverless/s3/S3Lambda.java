package com.trivadis.te2018.serverless.s3;

public class S3Lambda {
	
	/**
	 * Receives S3 JSON event as LinkedHashMap Structure
	 * @param s3Event S3 Event as LinkedHashMap
	 */
	public void handler(Object s3Event) {
        System.out.println("S3 event class:  " + s3Event.getClass());
		System.out.println("S3 event:  " + s3Event);
    }
	
//	/**
//	 * Maps S3 Event to a local Pojo class
//	 * @param s3EventJson converted S3 event
//	 */
//	public void handlerPojo(S3JsonEvent s3EventJson) {
//		String filename = s3EventJson.Records[0].s3.object.key;
//		Integer size = s3EventJson.Records[0].s3.object.size;
//		System.out.println("S3 event Filename: " + filename);
//		System.out.println("S3 event Size: " + size);
//	}
//	
	
}
