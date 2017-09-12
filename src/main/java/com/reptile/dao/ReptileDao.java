package com.reptile.dao;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;

import com.reptile.bean.Book;
import com.reptile.util.constants.ReptileConstants;
import com.reptile.util.db.DataSourceUtil;

public class ReptileDao {

	/**
	 * get data base
	 **/
	private static QueryRunner queryRunner = new QueryRunner();

	/**
	 * save book batch
	 * 
	 * @param data
	 *            the data get from html page
	 * @throws Exception
	 **/
	public static void saveBookBatch(List<Book> data) throws Exception {
		/*
		 * define an object array,
		 * 
		 */
		Object[][] params = new Object[data.size()][3];
		for (int i = 0; i < params.length; i++) {
			params[i][0] = data.get(i).getBookId();
			params[i][1] = data.get(i).getBookName();
			params[i][2] = data.get(i).getBookPrice();
		}
		queryRunner.batch(DataSourceUtil.getDataSource().getConnection(), ReptileConstants.SQL_INSERT, params);
		System.out.print("执行数据库完毕!" + "成功插入数据：" + data.size() + "条");
		DataSourceUtil.releaseConnection();
	}
}
