package com.jd.gallery.user.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.jd.gallery.user.service.userService;
import com.jd.gallery.user.vo.userVO;

@Service("userService")
public class userServiceImpl implements userService{
	
	@Resource(name="sqlSessoinTemplate")
	private SqlSession sqlSession;
	
	private static final String NAMESPACE = "userMapper";
	
	@Override
	public List<userVO> selectUserList() {
		return sqlSession.selectList(NAMESPACE+".selectUserList");
	}

	@Override
	public userVO selectOneUser(String userId) {
		System.out.println("여기");
		return sqlSession.selectOne(NAMESPACE+".selectOneUserByEmail");
	}

	@Override
	public int registerUser(userVO user) {
		// TODO Auto-generated method stub
		return 0;
	}

}
