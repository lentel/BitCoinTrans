/**
 * 
 */
package com.lentel.bitcoin.trans.market.common.model;

/**
 * @author lentel
 *
 */
public class Symbol {

	public String baseCurrency;
	
	public String quoteCurrency;
	
	public String symbol;

	public String getBaseCurrency() {
		return baseCurrency;
	}

	public void setBaseCurrency(String baseCurrency) {
		this.baseCurrency = baseCurrency;
	}

	public String getQuoteCurrency() {
		return quoteCurrency;
	}

	public void setQuoteCurrency(String quoteCurrency) {
		this.quoteCurrency = quoteCurrency;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	@Override
	public String toString() {
		return "Symbol [baseCurrency=" + baseCurrency + ", quoteCurrency=" + quoteCurrency + ", symbol=" + symbol + "]";
	}
	
	

}
