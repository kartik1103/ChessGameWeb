package com.chessSite.ChessGame.Controller;

import com.chessSite.ChessGame.Model.OpponentDetails;
import com.chessSite.ChessGame.Service.OpponentDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class OpponentMvc {

    @Autowired
    private OpponentDetailsService opponentDetailsService;


    @GetMapping("/OpponentDetails/alldata")
    public String opponentDetailsData(Model model){
        List<OpponentDetails> opponentDetails = opponentDetailsService.getAllData();
        model.addAttribute("opponentDetails", opponentDetails);
        return "ThirdScreen";
    }
}
