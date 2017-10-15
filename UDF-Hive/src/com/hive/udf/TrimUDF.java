package com.hive.udf;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

public class TrimUDF extends UDF {
	
	private Text result=new Text();
	public Text evaluate(String str){
		
		str = str.trim();
		result.set(str);
		return result;
	}

}
