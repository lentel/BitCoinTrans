/**
 * 
 */
package com.lentel.bitcoin.trans.market.common.service;

/**
 * @author lentel
 *
 */
public interface OrderService {
	
	abstract String createOrder(String symbol, String method, float price, float volume);

	abstract String getOrderStatus(String orderId);
	
	abstract boolean cancelOrder(String orderId);
	
	abstract <T> T getOrderInfo(String orderId);

}
