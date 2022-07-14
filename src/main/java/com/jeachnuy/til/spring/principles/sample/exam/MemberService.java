package com.jeachnuy.til.spring.principles.sample.exam;

public interface MemberService {
    void join(Member member);
    Member findMember(Long memberId);
}
