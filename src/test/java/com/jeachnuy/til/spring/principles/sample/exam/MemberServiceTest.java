package com.jeachnuy.til.spring.principles.sample.exam;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {
    MemberService memberService = new MemberServiceImpl();

    @Test
    void join() {
        var member = new Member(1L, "memberA", Grade.VIP);

        memberService.join(member);
        var findMember = memberService.findMember(1L);

        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
