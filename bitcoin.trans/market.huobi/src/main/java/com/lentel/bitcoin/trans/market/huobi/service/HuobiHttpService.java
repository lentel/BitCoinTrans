/**
 * 
 */
package com.lentel.bitcoin.trans.market.huobi.service;

import com.lentel.bitcoin.trans.market.common.service.*;

/**
 * @author lentel
 *
 */
public interface HuobiHttpService extends HttpService{

	public <T> T httpGet(String url, String param);
	
	public <T> T httpPost(String url, String param);
}
