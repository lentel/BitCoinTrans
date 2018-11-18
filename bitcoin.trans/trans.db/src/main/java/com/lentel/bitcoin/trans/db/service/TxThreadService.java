package com.lentel.bitcoin.trans.db.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lentel.bitcoin.trans.db.model.TxThreadDO;


public interface TxThreadService {
	
	public int getTxThreadCount();
	
	public List<TxThreadDO> getTxThreadList();
   

}
