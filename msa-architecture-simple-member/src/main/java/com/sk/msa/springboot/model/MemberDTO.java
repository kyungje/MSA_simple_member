package com.sk.msa.springboot.model;

import lombok.Data;

@Data
public class MemberDTO {
	int memberId;
	String memberName;
	String homeAddress;
	int phoneNumberMobile;
}
