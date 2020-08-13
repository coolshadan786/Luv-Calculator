package com.springFrame.lc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springFrame.lc.api.UserInfoDTO;

@Controller
public class LCAppController {

/*	@RequestMapping("/")
	public String showHomePage(Model model) {			//1st mtdh using Model interface in argument
		
		//read the default/existing properties by fetching it from the dto
		UserInfoDTO userInfo = new UserInfoDTO();
		model.addAttribute("userInfo", userInfo);
		
		return "home-page";
	}*/
	
	
	@RequestMapping("/")								//2nd mtdh using @ModelAttribute anno instead of Model Interface and remove the much more line code in this mtdh in comparison to 1st mtdh
	public String showHomePage(@ModelAttribute("userInfo") UserInfoDTO userInfo) {
		
		//read the default/existing properties by fetching it from the dto
		//here the 3 lines of code remove like as in 1st mtdh if we using @ModelAttribute and we pass DTO class as in argu mtdh
		
		return "home-page";
	}
	
/*	@RequestMapping("/processhomepage")
	public String showRResultpage(@RequestParam("userName") String userName1,@RequestParam("crushName") String crushName1,Model model) {		//If user like given other var name as like from-Page(userName) then pass in @RequestParam("userName")
	
//	@RequestMapping("/processhomepage")
//	public String showResultpage(@RequestParam String userName,@RequestParam String crushName,Model model ) {			//If user like given same var name as  like from-Page(userName) then pass in @RequestParam("NO NEED TO PASS") take var name as form-page.

		
		System.out.println("user name is " + userName1);
		System.out.println("crush name is " + crushName1);
		
		model.addAttribute("userName", userName1);
		model.addAttribute("crushName", crushName1);
		
		return "result-page";
	}*/
	
		//1st mtdh using without @ModelAttribute("userInfo") if we not use then we have to code much more lines of codes by it self like passing val,set/add throgh mtdh and other
/*	@RequestMapping("/processhomepage")
	public String showResultpage(UserInfoDTO userInfoDTO,Model model ) {			//If user like given same var name as  like from-Page(userName) then pass in @RequestParam("NO NEED TO PASS") take var name as form-page.
		
		//writing the value to the properties by fetching from the url
		System.out.println("user name is " + userInfoDTO.getUserName());
		System.out.println("crush name is " + userInfoDTO.getCrushName());
	
	 	model.addAttribute("userInfo", userInfoDTO);
		
		return "result-page";
	}*/
	
		//2nd mtdh using @ModelAttribute("userInfo") we not need to code much more lines of codes like in (1st mtdh of (public String showResultpage(UserInfoDTO userInfoDTO,Model model))by it self like passing val,set/add throgh mtdh and other
/*	@RequestMapping("/processhomepage")
	public String showResultpage(@ModelAttribute("userInfo") UserInfoDTO userInfoDTO) {			//If user like given same var name as  like from-Page(userName) then pass in @RequestParam("NO NEED TO PASS") take var name as form-page.
		
		//writing the value to the properties by fetching from the url
		
		
		return "result-page";
	}*/
	
		//In this mtdh using @Valid anno u must be write just before of (UserInfoDTO userInfoDTO)class and BindingResult Interface (BindingResult result) just after (UserInfoDTO userInfoDTO)class for binding result whatever it came from the from(result-page.jsp) page of error like stuff  
	@RequestMapping("/processhomepage")
	public String showResultpage(@Valid @ModelAttribute("userInfo") UserInfoDTO userInfoDTO,BindingResult result) {			
		
		//writing the value to the properties by fetching from the url
		System.out.println(userInfoDTO.isTermAndCondition());
		
		if(result.hasErrors()) {
			
			List<ObjectError> allErrors = result.getAllErrors();
			for(ObjectError temp:allErrors) {
				System.out.println(temp);
			}
			return "home-page";
		}
		
		
		return "result-page";
	}
}
  