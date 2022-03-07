package dev.springrunner

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.servlet.ModelAndView
import org.springframework.web.servlet.View
import org.springframework.web.servlet.view.JstlView

@Controller
class HelloController {

    @RequestMapping("/hello")
    fun hello(@RequestParam("name") name: String): ModelAndView {
        // Model
        val model = HelloModel(name)

        // View 생성
        val view: View = JstlView("/WEB-INF/templates/HelloView.jsp")

        // ModelAndView 생성 및 초기화
        val mav = ModelAndView()
        mav.addObject("hello", model)
        mav.view = view

        return mav
    }
}
