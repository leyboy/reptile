package com.reptile.util;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.message.BasicHttpResponse;

import com.reptile.util.constants.ReptileConstants;

/**
 * @author LiuEnYuan
 * @version 1.1 http utils
 **/
public class HttpUtils {

	/**
	 * get raw html
	 * @param client
	 * @param url
	 * @throws IOException
	 * 				when http server response failure,can throws {@link IOException}
	 * **/
	public static HttpResponse getRawHtml(HttpClient client, String url) {
		HttpGet getMethod = new HttpGet(url);
		HttpResponse response = new BasicHttpResponse(HttpVersion.HTTP_1_1, HttpStatus.SC_OK, ReptileConstants.OK);
		try {
			response=client.execute(getMethod);
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			//getMethod.abort();
		}
		return response;
	}
}
