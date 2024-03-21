package com.chessSite.ChessGame.Controller;

import com.chessSite.ChessGame.Model.ChessPlayer;
import com.chessSite.ChessGame.Model.IntlTournamentsPlayed;
import com.chessSite.ChessGame.Service.ChessPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MvcController {

    @Autowired
    private ChessPlayerService chessPlayerService;

    @GetMapping("/")
    public String getHomePage(Model model){

        return "InitialScreen";
    }


    @GetMapping("/chessPlayer/alldata")
    public String getChessPlayerAllData(Model model){

        List<ChessPlayer> chessPlayers = chessPlayerService.getAllData();
        model.addAttribute("chessPlayers", chessPlayers);
        return "FirstScreen";
    }

}
