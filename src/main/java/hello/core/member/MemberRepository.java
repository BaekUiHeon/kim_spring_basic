package hello.core.member;

import org.springframework.context.annotation.ComponentScan;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long id);
}
