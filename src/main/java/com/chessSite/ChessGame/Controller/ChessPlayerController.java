package com.chessSite.ChessGame.Controller;

import com.chessSite.ChessGame.Model.ChessPlayer;
import com.chessSite.ChessGame.Service.ChessPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ChessPlayerController {

    @Autowired
    private ChessPlayerService chessPlayerService;

    @GetMapping("/chessPlayer/{id}")
    public ChessPlayer getChessPlayerData(@PathVariable int id){

        try {
            ChessPlayer chessPlayer = chessPlayerService.getChessPlayerData(id);

//            System.out.print("Id" + chessPlayer.getChessId());
//            System.out.print("player name" + chessPlayer.getPlayerName());
//            System.out.print("player rating" + chessPlayer.getPlayerRating());

            return chessPlayer;
        } catch (ChangeSetPersister.NotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @PutMapping("/chessPlayer/update")
    public ChessPlayer updateChessPlayerData(@RequestBody ChessPlayer chessPlayer){
        return chessPlayerService.updateChessPlayerData(chessPlayer);
    }

    @PostMapping("/chessPlayer/insert")
    public ChessPlayer insertChessPlayerData(@RequestBody ChessPlayer chessPlayer){
        return chessPlayerService.insertChessPlayerData(chessPlayer);
    }

    @DeleteMapping("chessPlayer/{id}")
    public int deleteChessPlayerData(@PathVariable int id){
        return chessPlayerService.deleteChessPlayerData(id);
    }

    @GetMapping("chessPlayer/all")
    public List<ChessPlayer> getChessPlayerAllData(){
        return chessPlayerService.getAllData();
    }


}
