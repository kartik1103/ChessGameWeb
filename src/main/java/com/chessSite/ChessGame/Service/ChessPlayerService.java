package com.chessSite.ChessGame.Service;

import com.chessSite.ChessGame.Dao.ChessPlayerRepo;
import com.chessSite.ChessGame.Model.ChessPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChessPlayerService {
    @Autowired
    private ChessPlayerRepo chessPlayerRepo;

    public ChessPlayer getChessPlayerData(int id) throws ChangeSetPersister.NotFoundException {
        return chessPlayerRepo.findById(id).orElseThrow(ChangeSetPersister.NotFoundException::new);
    }

    public ChessPlayer updateChessPlayerData(ChessPlayer chessPlayer){
        return chessPlayerRepo.save(chessPlayer);
    }

    public ChessPlayer insertChessPlayerData(ChessPlayer chessPlayer){
        return chessPlayerRepo.save(chessPlayer);
    }

    public int deleteChessPlayerData(int id){
        chessPlayerRepo.deleteById(id);
//        System.out.println("Deleted the id - " + id);
        return id;
    }

    public List<ChessPlayer> getAllData(){
        return (List<ChessPlayer>) chessPlayerRepo.findAll();
    }

}
