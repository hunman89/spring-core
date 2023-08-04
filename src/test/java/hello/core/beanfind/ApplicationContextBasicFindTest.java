package hello.core.beanfind;

import hello.core.AppConfig;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ApplicationContextBasicFindTest {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    void findBeanName() {
        MemberService memberService = ac.getBean("memberService", MemberService.class);
        assertInstanceOf(MemberServiceImpl.class, memberService);
    }

    @Test
    void findBeanType() {
        MemberService memberService = ac.getBean(MemberService.class);
        assertInstanceOf(MemberServiceImpl.class, memberService);
    }

    @Test
    void findBeanSpecificType() {
        MemberService memberService = ac.getBean("memberService", MemberServiceImpl.class);
        assertInstanceOf(MemberServiceImpl.class, memberService);
    }

    @Test
    void findBeanNameFail() {
        assertThrows(NoSuchBeanDefinitionException.class, () -> ac.getBean("xxxx", MemberService.class));
    }
}
