package com.paotui.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

//Converter 接口中，第一个参数表示要处理的数据的类型，第二参数表示要转换的数据的类型
public class CustomerDateConvert implements Converter<String, Date>{

	SimpleDateFormat[] formats = new SimpleDateFormat[]{
			new SimpleDateFormat("yyyy-MM-dd"),
			new SimpleDateFormat("yyyyMMdd"),
			new SimpleDateFormat("yyyy.MM.dd"),
			new SimpleDateFormat("yyyy年MM月dd日"),
			new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"),
			new SimpleDateFormat("yyyy年MM月dd HH.mm.ss"),
			new SimpleDateFormat("yyyy.MM.dd HH.mm.ss")
	};
	@Override
	public Date convert(String source) {
		
		if(source == null || source.trim().isEmpty()){
			return null;
		}
		for (SimpleDateFormat sdf : formats) {
			try {
				// 日期格式字符串转为日期对象
				return sdf.parse(source);
			} catch (ParseException e) {
				//e.printStackTrace();
				continue;
			}
		}
		return null;
	}
}
