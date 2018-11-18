package com.lentel.bitcoin.trans.db.dao;

import org.springframework.stereotype.Service;

import com.lentel.bitcoin.trans.db.model.TxThreadDO;
import com.lentel.bitcoin.trans.db.model.TxThreadDOKey;


public interface TxThreadDOMapper {
	
	int getCount();
	
    int deleteByPrimaryKey(TxThreadDOKey key);

    int insert(TxThreadDO record);

    int insertSelective(TxThreadDO record);

    TxThreadDO selectByPrimaryKey(TxThreadDOKey key);

    int updateByPrimaryKeySelective(TxThreadDO record);

    int updateByPrimaryKey(TxThreadDO record);
}