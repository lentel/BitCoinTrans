/**
 * 
 */
package com.lentel.bitcoin.trans.db.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lentel.bitcoin.trans.db.dao.TxThreadDOMapper;
import com.lentel.bitcoin.trans.db.model.TxThreadDO;
import com.lentel.bitcoin.trans.db.service.TxThreadService;

/**
 * @author lentel
 *
 */
@Service("TxThreadService")
public class TxThreadServiceImpl implements TxThreadService{
	
//	private static final Logger LOG = LoggerFactory.getLogger(TxThreadServiceImpl.class);
	
	@Autowired
	TxThreadDOMapper txThreadDOMapper;
	

	public int getTxThreadCount() {
		// TODO Auto-generated method stub
//		return 5;
		return txThreadDOMapper.getCount();
	}

	public List<TxThreadDO> getTxThreadList() {
		// TODO Auto-generated method stub
		return null;
	}

}
