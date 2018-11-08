package com.lentel.bitcoin.trans.market.huobi.service;

public interface OrderService {
	
	public String createOrder(String symbol, String method, float price, float volume);

	public String getOrderStatus(String orderId);
	
	public boolean cancelOrder(String orderId);
	
	public <T> T getOrderInfo(String orderId);
}
