package com.sk.msa.springboot.repository.rvo;

import lombok.Data;

@Data
public class MemberVO {
	int memberId;
	String memberName;
	String homeAddress;
	int phoneNumberMobile;
}
