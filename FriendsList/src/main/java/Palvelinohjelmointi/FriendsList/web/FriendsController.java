package Palvelinohjelmointi.FriendsList.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Palvelinohjelmointi.FriendsList.domain.Friend;

@Controller
public class FriendsController {

	private ArrayList<String> friends = new ArrayList<>();

	@GetMapping("/friend")
	public String addtoFriends(@RequestParam(name = "name", required = false) String name, Model model) {
		if (name != null) {
			friends.add(name);
		}
		model.addAttribute("friends", friends);
		return "friendsList";
	}
}
