package springmvc.homecontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {
		@RequestMapping(method=RequestMethod.GET)
		public ModelAndView displayHomePage() {
			ModelAndView mav = new ModelAndView("Home");
			
			return mav;
		}
		@RequestMapping(value="/form", method=RequestMethod.GET)
		public ModelAndView displayForm( @ModelAttribute("user")User user) {
			ModelAndView mav = new ModelAndView("form");
			
			return mav;
		}
		
		@RequestMapping(value="/process-form", method=RequestMethod.POST)
		public ModelAndView processForm(@ModelAttribute("user")User user) {
			ModelAndView mav = new ModelAndView("submission-details");
			
			return mav;

}
}