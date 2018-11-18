/**
 * 
 */
package com.lentel.bitcoin.trans.monitor.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lentel.bitcoin.trans.db.service.*;


/**
 * @author lentel
 *
 */
@RestController
public class TxThreadController {

	private static final Logger LOG = LoggerFactory.getLogger(TxThreadController.class);
	
	@Autowired
	TxThreadService txThreadService;
	
//	TxThreadService txThreadService = (TxThreadService)SpringContextUtil.getBean(TxThreadService.class);
	
	@RequestMapping("/tt/getTxThreadCount")
	public int getTxThreadCount() {
		
		LOG.debug("---------->");
		
		return txThreadService.getTxThreadCount();
	
	}
	
}
