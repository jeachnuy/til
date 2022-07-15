package com.jeachnuy.til.spring.principles.sample.exam;

public interface MemberRepository { //회원 저장소
    void save(Member member);
    Member findById(Long memberId);
}
