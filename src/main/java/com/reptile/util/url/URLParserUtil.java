package com.reptile.util.url;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.util.EntityUtils;

import com.reptile.bean.Book;
import com.reptile.util.BookJsonParserUtil;
import com.reptile.util.HttpUtils;
import com.reptile.util.constants.ReptileConstants;

/**
 * @author LiuEnYuan
 * @version 1.1
 * url parser util
 * **/
public class URLParserUtil {

	public static List<Book> URLParser(HttpClient client, String url) throws Exception {
		// use receive resolve data
		List<Book> data = new ArrayList<Book>();
		// get network response html,call HttpUtils
		HttpResponse response = HttpUtils.getRawHtml(client, url);
		// get response status code
		int statusCode = response.getStatusLine().getStatusCode();
		if (statusCode == 200) {
			String entity = EntityUtils.toString(response.getEntity(), ReptileConstants.CHARACTER_ENCODING);
			data = BookJsonParserUtil.getData(entity);
			EntityUtils.consume(response.getEntity());
		} else {
			// consume entity
			EntityUtils.consume(response.getEntity());
		}
		return data;
	}
}
