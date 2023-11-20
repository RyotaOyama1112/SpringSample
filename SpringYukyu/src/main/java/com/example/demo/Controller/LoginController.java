package com.example.demo.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    @PostMapping("/login")
    public String processLogin(@ModelAttribute("user") User user, HttpSession session, Model model) {
        Optional<User> authenticatedUser = userService.authenticateUser(user.getUserId(), user.getPassword());

        if (authenticatedUser.isPresent()) {
            session.setAttribute("user_id", authenticatedUser.get().getUserId());
            session.setAttribute("user_busyo", authenticatedUser.get().getBusyo());
            session.setAttribute("user_KanriFlg", authenticatedUser.get().getKanriFlg());

            if (authenticatedUser.get().getKanriFlg() == 1) {
                return "redirect:/loginJugyouin";
            } else if (authenticatedUser.get().getKanriFlg() == 3) {
                return "redirect:/loginKanrisya";
            }
        } else {
            model.addAttribute("loginFailure", "ログインに失敗しました");
            return "login";
        }
        return "login"; // 何かしらのエラーが発生した場合はログイン画面を表示
    }
}
