package com.reptile.util;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.reptile.bean.Book;
import com.reptile.util.constants.ReptileConstants;

/**
 * book json parser util 将从页面获取的数据进行封装成book
 **/
public class BookJsonParserUtil {

	/**
	 * get data from html page
	 * @param html
	 * 			html page
	 * **/
	public static List<Book> getData(String html) throws Exception {
		
		//get data to list
		List<Book> data=new ArrayList<Book>();
		//use jsoup resovle
		Document document=Jsoup.parse(html);
		//get html tag data
		Elements elements=document.select(ReptileConstants.ELEMENTS_SELECT_CSS_UL)
				.select(ReptileConstants.ELEMENTS_SELECT_CSS_LI);
		for(Element element : elements){
			String bookId=element.attr(ReptileConstants.ELEMENTS_BOOK_ID);
			String bookPrice=element.select(ReptileConstants.ELEMENTS_BOOK_CSS_PRICE)
					.select(ReptileConstants.ELEMENTS_BOOK_PRICE_CSS_STRONG)
					.select(ReptileConstants.ELEMENTS_BOOK_PRICE_CSS_I).text();
			String bookName=element.select(ReptileConstants.ELEMENTS_BOOK_CSS_NAME)
					.select(ReptileConstants.ELEMENTS_BOOK_CSS_NAME_EM).text();
			Book book=new Book(bookId,bookName,bookPrice);
			data.add(book);
		}
		return data;
	}
}
