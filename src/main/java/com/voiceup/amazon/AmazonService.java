package com.voiceup.amazon;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpPost;

public class AmazonService {
	
	private static String CLIENT_ID ="amzn1.application-oa2-client.7244d8e9dfcb4687aa7c30eb840be4b7";
	private static String CLIENT_SECRET ="4e5f1e842f54d9c8488c599103dc03c2c179189a33297bd6fa0e27ecb742fcf4";
	
	
	
	public AmazonService(){
		
	}
	
	private void auth(){
//		HttpPost httpPost = new HttpPost("http://targethost/login");
//		List <NameValuePair> nvps = new ArrayList <NameValuePair>();
//		nvps.add(new BasicNameValuePair("username", "vip"));
//		nvps.add(new BasicNameValuePair("password", "secret"));
//		httpPost.setEntity(new UrlEncodedFormEntity(nvps));
//		CloseableHttpResponse response2 = httpclient.execute(httpPost);
//
//		try {
//		    System.out.println(response2.getStatusLine());
//		    HttpEntity entity2 = response2.getEntity();
//		    // do something useful with the response body
//		    // and ensure it is fully consumed
//		    EntityUtils.consume(entity2);
//		} finally {
//		    response2.close();
//		}
	}

}
