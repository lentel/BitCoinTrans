/**
 * 
 */
package com.lentel.bitcoin.trans.market.huobi.service;

import java.util.Map;
/**
 * @author lentel
 *
 */


public interface SignatureService {

	 public void createSignature(String appKey, String appSecretKey, String method, String host,
             String uri, Map<String, String> params);
}
