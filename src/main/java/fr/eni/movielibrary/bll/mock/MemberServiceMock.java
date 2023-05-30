package fr.eni.movielibrary.bll.mock;

import fr.eni.movielibrary.bll.MemberService;
import fr.eni.movielibrary.bo.Member;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@Profile("dev")
public class MemberServiceMock implements MemberService {
    private static List<Member> lstMembers;

    public MemberServiceMock() {
        lstMembers = Arrays.asList(new Member(1, "Doe", "John", "jdoe", "123456", false),
                new Member(1, "Doe", "John", "jdoe", "123456", false),
                new Member(1, "Doe", "John", "jdoe", "123456", false));
    }

    @Override
    public List<Member> getAllMembers() {
        return lstMembers;
    }

    @Override
    public Member getMemberById(int id) {
        for (Member member : lstMembers) {
            if (member.getId() == id) {
                return member;
            }
        }
        return null;
    }

    @Override
    public Member getMemberByLogin(String login) {
        for (Member member : lstMembers) {
            if (member.getLogin().equals(login)) {
                return member;
            }
        }
        return null;
    }
}
