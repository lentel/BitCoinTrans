/**
 * 
 */
package com.lentel.bitcoin.trans.market.huobi.model;

/**
 * @author lentel
 * 
 * @Modefy time : 2018-11-8 13:47:42
 *
 */
public class Order {
	
	public String orderId;
	
	public String method;
	
	public String symbol;
	
	public float price;
	
	public float volume;
	
	public boolean orderStatus;
	
	public String orderInfo;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getVolume() {
		return volume;
	}

	public void setVolume(float volume) {
		this.volume = volume;
	}

	public boolean isOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(boolean orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderInfo() {
		return orderInfo;
	}

	public void setOrderInfo(String orderInfo) {
		this.orderInfo = orderInfo;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", method=" + method + ", symbol=" + symbol + ", price=" + price
				+ ", volume=" + volume + ", orderStatus=" + orderStatus + ", orderInfo=" + orderInfo + "]";
	}
	
	

}
