package com.mycompany.project1123.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mycompany.project1123.model.vo.Member;
import com.mycompany.project1123.service.MemberService;

@Controller
@SessionAttributes("msg")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView index(ModelAndView mv) {
		
		
		String view = "index";
		
		
		mv.setViewName(view);
		return mv;
	}
	
	
	@RequestMapping(value = "signUp", method = RequestMethod.POST)
	public String singUp(RedirectAttributes ra,
			@RequestParam(value="memberId")String id,
			@RequestParam(value="memberPwd")String pwd,
			@RequestParam(value="memberName")String name) {
		int result = 0;
		Member m = new Member(id,pwd,name);
		
		//result = memberService.select(m);
			
		try {
			result =  memberService.insert(m);
			if(result != 0) { // 가입성공
				ra.addFlashAttribute("msg","회원가입 성공");
			}else if(result == 0) { //가입실패
				ra.addFlashAttribute("msg","회원가입 실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
			ra.addFlashAttribute("msg", "회원가입 과정에서 오류 발생");
			return "redirect:/";
		}
		
		
		
		return "redirect:/";
	}
	
	
	
	
	
	
	
	
	
	
}
