package com.sk.msa.springboot.service.implementSrv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sk.msa.springboot.model.MemberDTO;
import com.sk.msa.springboot.repository.mapper.IMemberMapper;
import com.sk.msa.springboot.repository.rvo.MemberVO;
import com.sk.msa.springboot.service.interfaceSrv.IMemberSearch;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class MemberSearchImpl implements IMemberSearch {

	@Autowired
	private IMemberMapper accountMapper;

	@Override
	public MemberDTO getAllMemberInfo(int memberID) {
		log.debug("getAllAccountInfo memberID :" + memberID);
		MemberDTO memberDTO = new MemberDTO();
		MemberVO memberVO = new MemberVO();

		memberVO = accountMapper.findAllMemberInfoByMemberID(memberID);

		log.debug("getAllMemberInfo memberVO :" + memberVO);

		memberDTO.setMemberId(memberVO.getMemberId());
		memberDTO.setMemberName(memberVO.getMemberName());
		memberDTO.setHomeAddress(memberVO.getHomeAddress());
		memberDTO.setPhoneNumberMobile(memberVO.getPhoneNumberMobile());

		log.debug("getAllAccountInfo memberDTO :" + memberDTO);

		return memberDTO;
	}

}
