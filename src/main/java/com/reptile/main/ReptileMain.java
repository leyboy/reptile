package com.reptile.main;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClients;

import com.reptile.bean.Book;
import com.reptile.dao.ReptileDao;
import com.reptile.util.constants.ReptileConstants;
import com.reptile.util.url.URLParserUtil;

public class ReptileMain {

	private static final Log LOGGER = LogFactory.getLog(ReptileMain.class);

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// init a httpClient
		HttpClient client = HttpClients.createDefault();
		// get an http url address
		List<Book> books = URLParserUtil.URLParser(client, ReptileConstants.HTTP_URL_SECOND);
		for (Book book : books) {
			LOGGER.info("bookId:" + book.getBookId() + "\t" + "bookName:" + book.getBookName() + "\t" + "bookPrice:"
					+ book.getBookPrice());
		}
		ReptileDao.saveBookBatch(books);
	}

}
