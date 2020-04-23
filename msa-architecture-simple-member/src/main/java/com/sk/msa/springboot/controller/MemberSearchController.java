package com.sk.msa.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.sk.msa.springboot.model.MemberDTO;
import com.sk.msa.springboot.repository.rvo.MemberVO;
import com.sk.msa.springboot.service.interfaceSrv.IMemberSearch;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class MemberSearchController {

	@Autowired
	IMemberSearch accountSearch;

	@HystrixCommand
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ResponseEntity<MemberVO> getEchoMemberInfo(@RequestBody MemberVO accountVO) {
		log.debug("getEchoAccountInfo accountVO : " + accountVO);
		return new ResponseEntity<MemberVO>(accountVO, HttpStatus.OK);
	}


	@HystrixCommand
	@RequestMapping(value = "/member/{memberId}", method = RequestMethod.POST)
	public ResponseEntity<MemberDTO> getAllMemberInfo(@PathVariable("memberId") int memberId) {
		log.debug("getAllMemberInfo memberId : " + memberId);
		MemberDTO memberDTO = accountSearch.getAllMemberInfo(memberId);
		log.debug("getAllMemberInfo memberDTO : " + memberDTO);
		return new ResponseEntity<MemberDTO>(memberDTO, HttpStatus.OK);
	}
}
