package com.sk.msa.springboot.repository.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.sk.msa.springboot.repository.rvo.MemberVO;

/**
 * @author 07198
 * Account
 */
@Mapper
public interface IMemberMapper {
	MemberVO findAllMemberInfoByMemberID(int memberID);
}
