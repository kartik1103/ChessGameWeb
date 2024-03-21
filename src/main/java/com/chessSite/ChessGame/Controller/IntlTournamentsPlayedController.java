package com.chessSite.ChessGame.Controller;

import com.chessSite.ChessGame.Model.IntlTournamentsPlayed;
import com.chessSite.ChessGame.Service.IntlTournamentsPlayedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class IntlTournamentsPlayedController {

    @Autowired
    private IntlTournamentsPlayedService intlTournamentsPlayedService;

    @GetMapping("tournamentsList/{id}")
    public IntlTournamentsPlayed getTournamentDetails(@PathVariable int id){
        return intlTournamentsPlayedService.getTournamentsData(id);
    }

    @PutMapping("tournamentsList/update")
    public IntlTournamentsPlayed updateTournamentDetails(@RequestBody IntlTournamentsPlayed intlTournamentsPlayed){
        return intlTournamentsPlayedService.updateTournamentsData(intlTournamentsPlayed);
    }

    @PostMapping("/tournamentsList/insert")
    public IntlTournamentsPlayed insertTournamentDetails(@RequestBody IntlTournamentsPlayed intlTournamentsPlayed){
        return intlTournamentsPlayedService.insertTournamentsData(intlTournamentsPlayed);
    }

    @DeleteMapping("tournamentsList/{id}")
    public int deleteTournamentDetails(@PathVariable int id){
        return intlTournamentsPlayedService.deleteTournamentsData(id);
    }





    @GetMapping("tournamentsById/{id}")
    public List<IntlTournamentsPlayed> getById(@PathVariable int id){
        return intlTournamentsPlayedService.getDatafromId(id);
    }

}
