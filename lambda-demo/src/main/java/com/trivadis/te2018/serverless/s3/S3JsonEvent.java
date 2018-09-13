package com.trivadis.te2018.serverless.s3;

public class S3JsonEvent {
	public Record[] Records;

	static class Record {
		public S3 s3;
	}

	static class S3 {
		public S3Object object;
	}

	static class S3Object {
		public String key;
		public Integer size;

	}
}


/**
 {
  "Records": [
    {
      "eventTime": "1970-01-01T00:00:00.000Z",
      "s3": {
        "object": {
          "eTag": "0123456789abcdef0123456789abcdef",
          "sequencer": "0A1B2C3D4E5F678901",
          "key": "HappyFace.jpg",
          "size": 1024
        }

      }
      "eventSource": "aws:s3"
    }
  ]
}
*/