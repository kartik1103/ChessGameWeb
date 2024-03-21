package com.chessSite.ChessGame.Service;

import com.chessSite.ChessGame.Dao.IntlTournamentsPlayedRepo;
import com.chessSite.ChessGame.Model.IntlTournamentsPlayed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IntlTournamentsPlayedService {

    @Autowired
    private IntlTournamentsPlayedRepo intlTournamentsPlayedRepo;

    public IntlTournamentsPlayed getTournamentsData(int id){

        try {
            return intlTournamentsPlayedRepo.findById(id).orElseThrow(ChangeSetPersister.NotFoundException::new);
        } catch (ChangeSetPersister.NotFoundException e) {
            throw  new RuntimeException(e);
        }
    }

    public IntlTournamentsPlayed updateTournamentsData(IntlTournamentsPlayed intlTournamentsPlayed){
        return intlTournamentsPlayedRepo.save(intlTournamentsPlayed);
    }

    public IntlTournamentsPlayed insertTournamentsData(IntlTournamentsPlayed intlTournamentsPlayed){
        return intlTournamentsPlayedRepo.save(intlTournamentsPlayed);
    }

    public int deleteTournamentsData(int id){
        intlTournamentsPlayedRepo.deleteById(id);
        return id;
    }

    public List<IntlTournamentsPlayed> getAllData(){
        return (List<IntlTournamentsPlayed>) intlTournamentsPlayedRepo.findAll();
    }

    public List<IntlTournamentsPlayed> getDatafromId(int id){
        return intlTournamentsPlayedRepo.getDatafromChessId(id);
    }

}
