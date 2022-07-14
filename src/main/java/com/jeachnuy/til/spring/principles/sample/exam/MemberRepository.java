package com.jeachnuy.til.spring.principles.sample.exam;

public interface MemberRepository {
    void save(Member member);
    Member findById(Long memberId);
}
