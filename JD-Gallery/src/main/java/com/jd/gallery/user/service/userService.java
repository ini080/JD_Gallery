package com.jd.gallery.user.service;

import java.util.List;

import com.jd.gallery.user.vo.userVO;

public interface userService {
	
	// 유저 목록 조회
	public List<userVO> selectUserList();
	
	// 유저 상세 조회
	public userVO selectOneUser(String userId);
	
	// 유저 회원 가입
	public int registerUser(userVO user);

}
