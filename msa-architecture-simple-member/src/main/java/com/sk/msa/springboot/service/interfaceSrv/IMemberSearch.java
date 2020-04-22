package com.sk.msa.springboot.service.interfaceSrv;

import com.sk.msa.springboot.model.MemberDTO;

public interface IMemberSearch {
	public MemberDTO getAllMemberInfo(int accountSeq); 
}
