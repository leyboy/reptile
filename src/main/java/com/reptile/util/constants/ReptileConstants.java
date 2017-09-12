package com.reptile.util.constants;

/**
 * @author LiuEnYuan
 * @version 1.1 reptile constants contains this project all constants
 **/
public final class ReptileConstants {

	/** define jdbc properties position **/
	public static final String JDBC_PROPERTIES_POSITION = "src/main/resources/jdbc.properties";

	/** search http url first **/
	public static final String HTTP_URL_FIRST = "https://search.jd.com/Search?keyword=Python&enc=utf-8&wq=Python&pvid=d0216c44f0df45eab90fab25455ac9f7";

	/** search http url second **/
	public static final String HTTP_URL_SECOND = "https://search.jd.com/Search?keyword=Python&enc=utf-8&qrst=1&rt=1&stop=1&vt=2&wq=Python&page=5&s=109&click=0";

	/** character encoding **/
	public static final String CHARACTER_ENCODING = "UTF-8";

	/** http response status **/
	public static final String OK = "OK";

	/**
	 * document elements ul
	 **/
	public static final String ELEMENTS_SELECT_CSS_UL = "ul[class=gl-warp clearfix]";

	/**
	 * document elements li
	 **/
	public static final String ELEMENTS_SELECT_CSS_LI = "li[class=gl-item]";

	/** get book id html data **/
	public static final String ELEMENTS_BOOK_ID = "data-sku";

	/** get book name html data **/
	public static final String ELEMENTS_BOOK_CSS_NAME = "div[class=p-name]";

	/** get book name html data style **/
	public static final String ELEMENTS_BOOK_CSS_NAME_EM = "em";

	/** get book price html data **/
	public static final String ELEMENTS_BOOK_CSS_PRICE = "div[class=p-price]";

	/** get book price html data style strong **/
	public static final String ELEMENTS_BOOK_PRICE_CSS_STRONG = "strong";

	/** get book price html data style i **/
	public static final String ELEMENTS_BOOK_PRICE_CSS_I = "i";

	public static final String SQL_INSERT = "insert into tb_book(BookId,BookName,BookPrice)" + "values(?,?,?)";

}
