package com.chessSite.ChessGame.Service;

import com.chessSite.ChessGame.Dao.OpponentDetailsRepo;
import com.chessSite.ChessGame.Model.OpponentDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OpponentDetailsService {

    @Autowired
    private OpponentDetailsRepo opponentDetailsRepo;

    public OpponentDetails getOpponentDetails(int id){

        try {
            return opponentDetailsRepo.findById(id).orElseThrow(ChangeSetPersister.NotFoundException::new);
        } catch (ChangeSetPersister.NotFoundException e) {
            return null;
        }
    }

    public OpponentDetails updateOpponentDetails(OpponentDetails opponentDetails){
        return opponentDetailsRepo.save(opponentDetails);
    }

    public OpponentDetails insertOpponentDetails(OpponentDetails opponentDetails){
        return opponentDetailsRepo.save(opponentDetails);
    }

    public int deleteOpponentDetails(int id){
        opponentDetailsRepo.deleteById(id);
        return id;
    }

    public List<OpponentDetails> getAllData(){
        return (List<OpponentDetails>) opponentDetailsRepo.findAll();
    }


    public List<OpponentDetails> getDataFromId(int id){
        return opponentDetailsRepo.getAllOpponentfromId(id);
    }
}
