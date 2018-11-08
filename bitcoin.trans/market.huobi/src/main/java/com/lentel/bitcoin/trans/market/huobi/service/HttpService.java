/**
 * 
 */
package com.lentel.bitcoin.trans.market.huobi.service;

/**
 * @author lentel
 *
 */
public interface HttpService {

	public <T> T httpGet(String url, String param);
	
	public <T> T httpPost(String url, String param);
}
