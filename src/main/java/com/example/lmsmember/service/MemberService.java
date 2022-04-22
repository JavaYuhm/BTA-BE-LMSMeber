package com.example.lmsmember.service;

import com.example.lmsmember.entity.Member;

public interface MemberService {

    boolean register(Member member);
    boolean updateStatus(String userId, String userStatus);


}
