package com.care.root;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	static int cnt = 0;
	static Map<String, InfoDTO> DBMap = new HashMap<String, InfoDTO>();
	
	@PostMapping(value="membership", produces = "application/json;charset=utf-8")
	public String membership(@RequestBody Map<String, Object> map) {
		System.out.println(map.get("uId"));
		System.out.println(map.get("uName"));
		System.out.println(map.get("uAge"));
		System.out.println(map.get("uAddr"));
		System.out.println(map.get("uPhone"));
		return "{ \"result\" : true}";
	}
	
	@PutMapping(value="modify", produces = "application/json;charset=utf-8")
	public InfoDTO modify(@RequestBody InfoDTO dto) {
		DBMap.replace( dto.getName() , dto );
		return DBMap.get( dto.getName() );
	}
	//user?id=값
	@GetMapping(value="user", produces = "application/json;charset=utf-8")
	public InfoDTO user(@RequestParam String id) {
		// select * from member where id=?
		return DBMap.get(id);
	}
	@GetMapping(value="user/{name}", produces = "application/json;charset=utf-8")
	public InfoDTO user1(@PathVariable String name) {
		// select * from member where id=?
		return DBMap.get(name);
	}
	
	@GetMapping(value="users", produces = "application/json;charset=utf-8")
	public ArrayList<InfoDTO> users(){
		ArrayList<InfoDTO> list = new ArrayList<InfoDTO>();
		
		for(int i = cnt ; i<cnt+10 ; i++) {
			InfoDTO dto = new InfoDTO();
			dto.setName("홍길동"+i); dto.setAge(10+i);
			list.add(dto); DBMap.put("홍길동"+i, dto);
		}
		cnt += 10;
		return list;
	}
	
	
	
	@GetMapping(value="rest", produces = "application/json;charset=utf-8")
	public String get() {
		return "{\"execute\" : \"get 데이터 요청때 사용\"}";
	}
	@PostMapping(value="rest", produces = "application/json;charset=utf-8")
	public String post() {
		return "{\"execute\" : \"post 데이터 추가할때 사용\"}";
	}
	@PutMapping(value="rest", produces = "application/json;charset=utf-8")
	public String put() {
		return "{\"execute\" : \"put 데이터 수정때 사용\"}";
	}
	@DeleteMapping(value="rest", produces = "application/json;charset=utf-8")
	public String delete() {
		return "{\"execute\" : \"delete 데이터 삭제때 사용\"}";
	}
}



















