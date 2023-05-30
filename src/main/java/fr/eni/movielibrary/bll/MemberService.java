package fr.eni.movielibrary.bll;

import fr.eni.movielibrary.bo.Member;

import java.util.List;

public interface MemberService {

    public List<Member> getAllMembers();
    public Member getMemberById(int id);
    public Member getMemberByLogin(String login);
}
