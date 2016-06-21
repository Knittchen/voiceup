import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import junit.framework.Assert;

//https://www.amazon.com/ap/oa?client_id=amzn1.application-oa2-client.7244d8e9dfcb4687aa7c30eb840be4b7&scope=alexa%3Aall&scope_data=%7B%22alexa%3Aall%22%3A%7B%22productID%22%3A%22voice_up%22,%22productInstanceAttributes%22%3A%7B%22deviceSerialNumber%22%3A%2212345%22%7D%7D%7D&response_type=code&redirect_uri=http%3A%2F%2Flocalhost

public class DefaultTesting {
//	http://localhost/?access_token=Atza%7CIQEBLjAsAhQhzDgHuUPvSgvM&token_type=bearer&expires_in=3600&scope=alexa%3Aall
	@Test
	public void AmazonAuthTest(){
		
		String code = "ANvOSDazsLOikOICtAIp";
		String clientId = "amzn1.application-oa2-client.7244d8e9dfcb4687aa7c30eb840be4b7";
		String clientSecret ="4e5f1e842f54d9c8488c599103dc03c2c179189a33297bd6fa0e27ecb742fcf4";
		String grantType = "authorization_code";
		String redirectUri = "http://localhost";
		
		
		CloseableHttpClient httpclient = HttpClients.createDefault();
	HttpPost httpPost = new HttpPost("https://api.amazon.com/auth/o2/token");

	CloseableHttpResponse response2;
	try {
		httpPost.addHeader("Content-Type", "application/x-www-form-urlencoded");
		
		  HttpParams params = new BasicHttpParams();
		  params.setParameter("grant_type", grantType);
		  params.setParameter("code", code);
		  params.setParameter("client_id", clientId);
		  params.setParameter("client_secret", clientSecret);
		  params.setParameter("redirect_uri", redirectUri);
		  httpPost.setParams(params);

		
			response2 = httpclient.execute(httpPost);
			Assert.assertEquals(200, response2.getStatusLine().getStatusCode());
			//header
			System.out.println(response2.getStatusLine());
			HttpEntity entity2 = response2.getEntity();
			// do something useful with the response body
			// and ensure it is fully consumed
			EntityUtils.consume(entity2);
			response2.close();
	} catch (ClientProtocolException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();

	}
	}
}
