package com.flag.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.flag.app.Entity.Welcome;

public class FastJsonMain {

	static String json = "{\"study\": 10,\"study_course_count\": 10, \"recieved_reg_form_count\": 0,\"unread_count\": 5,\"teach_course_count\": 8,\"avatar\": \"1316634098115-02-57\",\"user_id\": 201,\"nickname\": \"Asus人名\"}";
	static String arrayAyy="[[14,\"小学语文\"],[155,\"美食\"],[72,\"高中物理\"],null,[50,\"高中化学\"],[15,\"小学数学\"],[13\"英语\"],null,[1,\"其他英语培训\"],null]";
	
			
	
	/**
	 * Json 转换 实体类 提示：FastJson在映射实体上非常棒， json有的K，实体没有，依然不影响解析..
	 */
	private void Json2Eetity() {
		// TODO Auto-generated method stub
		Welcome welcome = JSON.parseObject(json, Welcome.class);
		System.out.println(welcome.toString());
		System.out.println(welcome.getNickname());
	}

	/**
	 * 实体类 转换 Json
	 */
	private void Eetity2Json() {
		// TODO Auto-generated method stub
		Welcome welcome = new Welcome(2, 3, 4, 5, "imagUrl", 11, "Mers");
		String json = JSON.toJSONString(welcome, true);
		System.out.println("实体转换Json：" + json);
	}

	/**
	 * list集合转json格式字符串
	 */
	public void list2Json() {
		List<Welcome> list = new ArrayList<Welcome>();
		Welcome welcome1 = new Welcome(2, 3, 4, 5, "imagUrl", 11, "Mers");
		Welcome welcome2 = new Welcome(22, 33, 44, 55, "imag", 65, "Kers");
		Welcome welcome3 = new Welcome(64, 33, 34, 05, "imagUrl", 43, "Wers");
		Welcome welcome4 = new Welcome(62, 75, 41, 25, "imagUrl", 109, "Oers");
		list.add(welcome1);
		list.add(welcome2);
		list.add(welcome3);
		list.add(welcome4);
		String json = JSON.toJSONString(list, true);
		System.out.println("ist集合转json格式字符串 :" + json);
	}
	
	
	/**
	 * String转换 JSONArray
	 * 并且去除null
	 */
	private void String2JSONArray() {
		// TODO Auto-generated method stub
		JSONArray array=JSONArray.parseArray(arrayAyy);
		System.out.println(array);
		System.out.println("长度: "+array.size());
		
		Collection nuCon = new Vector(); 
		nuCon.add(null); 
		array.removeAll(nuCon);
		
		System.out.println(array);
		System.out.println("长度: "+array.size());
	}
	
	/**
	 * json to map
	 */
	private void json2Map(){ 
	      //Map -> JSON 
	      Map<String,Welcome> map = new HashMap<String, Welcome>(); 
	      map.put("a",new Welcome()); 
	      map.put("b",new Welcome()); 
	      map.put("c",new Welcome()); 
	      String json = JSON.toJSONString(map,true); 
	      System.out.println(json); 
	      //JSON -> Map 
	      Map<String,Welcome> map1 = (Map<String,Welcome>)JSON.parse(json); 
	      for (String key : map1.keySet()) { 
	              System.out.println(key+":"+map1.get(key)); 
	      } 
    } 
	
	/**
	 * map to json
	 */
	public void map2JSON(){ 
        Map map = new HashMap(); 
        map.put("a","aaa"); 
        map.put("b","bbb"); 
        map.put("c","ccc"); 
        String json=JSON.toJSONString(map); 
        System.out.println(json); 
        Map map1 = JSON.parseObject(json); 
        for (Object o : map.entrySet()) { 
                Map.Entry<String,String> entry = (Map.Entry<String,String>)o; 
                System.out.println(entry.getKey()+"--->"+entry.getValue()); 
        } 
} 
	
	/**
	 * 数组 到 json
	 */
	 public void array2JSON(){ 
         String[] arr_String = {"a","b","c"}; 
         String json_arr_String = JSON.toJSONString(arr_String,true); 
         System.out.println(json_arr_String); 
         JSONArray jsonArray = JSON.parseArray(json_arr_String); 
         for (Object o : jsonArray) { 
                 System.out.println(o); 
         } 
         System.out.println(jsonArray); 
      } 
	 
	 /**
	   * 数组到json
	   */
	 public void array2JSON2(){ 
		 Welcome[] arr_Bar = {new Welcome(),new Welcome(),new Welcome()}; 
         String json_arr_Bar = JSON.toJSONString(arr_Bar,true); 
         System.out.println(json_arr_Bar); 
         JSONArray jsonArray = JSON.parseArray(json_arr_Bar); 
         for (Object o : jsonArray) { 
                 System.out.println(o); 
         } 
         System.out.println(jsonArray); 
	 } 


	public static void main(String[] args) {
		FastJsonMain main = new FastJsonMain();
		
		main.Json2Eetity();
		System.out.println(" ");
		
		main.Eetity2Json();
		System.out.println("");
		
		main.list2Json();
		System.out.println(" ");
		
		main.String2JSONArray();
		
		main.json2Map();
		
		main.map2JSON();
		
		main.array2JSON();
		
		main.array2JSON2();
	}


	
}
