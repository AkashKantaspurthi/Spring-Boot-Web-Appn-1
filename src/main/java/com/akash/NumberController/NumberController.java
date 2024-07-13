package com.akash.NumberController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NumberController 
{
	@RequestMapping("/")
	public String Number()
	{
		return "number";
	}
	@RequestMapping("/pbn")
	public String biggestNumber(@RequestParam int fn1,@RequestParam int sn2,@RequestParam int tn3,ModelMap model)
	{
		model.put("k1", fn1);
		model.put("k2", sn2);
		model.put("k3", tn3);
		int biggestNumber=(fn1>sn2 && fn1>tn3)?fn1:((sn2>tn3)?sn2:tn3);
		model.put("bignumber", biggestNumber);
		return "result";	
	}
}
