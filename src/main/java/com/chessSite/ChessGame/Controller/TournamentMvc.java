package com.chessSite.ChessGame.Controller;

import com.chessSite.ChessGame.Model.IntlTournamentsPlayed;
import com.chessSite.ChessGame.Service.IntlTournamentsPlayedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TournamentMvc {

    @Autowired
    private IntlTournamentsPlayedService intlTournamentsPlayedService;

    @GetMapping("/tournamentList/alldata")
    public String tournamentListScreen(Model model){
        List<IntlTournamentsPlayed> intlTournamentsPlays = intlTournamentsPlayedService.getAllData();
        model.addAttribute("games", intlTournamentsPlays);
        return "SecondScreen";
    }

}
