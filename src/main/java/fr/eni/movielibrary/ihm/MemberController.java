package fr.eni.movielibrary.ihm;

import fr.eni.movielibrary.bll.MemberService;
import fr.eni.movielibrary.bo.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes({"loggedMember"})
public class MemberController {

    MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("member", new Member());
        return "/member/login";
    }

    @PostMapping("/login")
    public String loginAction(@ModelAttribute("formLogin") Member member, Model model) {
        model.addAttribute("loggedMember", member);
        return "redirect:/";
    }

    @GetMapping("/logout")
    public String logout(SessionStatus sessionStatus) {

        // Vide la session
        sessionStatus.setComplete();

        return "redirect:/";
    }
}
