package com.pgi;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarketController {
	
	@RequestMapping("/prodlist")
	public Map<String, Object> list() {
		Map<String, Object> prodList = new HashMap<String, Object>();
		
		prodList.put( "1", "{ 'prodName': 'ECA', 'prodCode': '123456', 'prodCost': '£10000'}");
		prodList.put( "2", "{ 'prodName': 'CISSP', 'prodCode': '789012', 'prodCost': '£20000'}");
		
		return prodList;
	}

}
