package com.chessSite.ChessGame.Controller;

import com.chessSite.ChessGame.Model.OpponentDetails;
import com.chessSite.ChessGame.Service.OpponentDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class OpponentDetailsController {

    @Autowired
    private OpponentDetailsService opponentDetailsService;

    @GetMapping("/opponentsDetails/{id}")
    public OpponentDetails getOpponentsDetails(@PathVariable int id){
        return opponentDetailsService.getOpponentDetails(id);
    }

    @PutMapping("opponentDetails/update")
    public OpponentDetails updateOpponentsDetails(@RequestBody OpponentDetails opponentDetails){
        return opponentDetailsService.updateOpponentDetails(opponentDetails);
    }

    @PostMapping("opponentDetails/insert")
    public OpponentDetails insertOpponentsDetails(@RequestBody OpponentDetails opponentDetails){
        return opponentDetailsService.insertOpponentDetails(opponentDetails);
    }

    @DeleteMapping("opponentDetails/{id}")
    public int deleteOpponentDetails(@PathVariable int id){
        return opponentDetailsService.deleteOpponentDetails(id);
    }


    @GetMapping("opponentsDetails/all")
    public List<OpponentDetails> getOpponentDetailsAll(){
        return opponentDetailsService.getAllData();
    }

    @GetMapping("opponentsDetailsById/{id}")
    public List<OpponentDetails> getOpponentsById(@PathVariable int id){

        return opponentDetailsService.getDataFromId(id);
    }

}
