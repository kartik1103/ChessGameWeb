package com.chessSite.ChessGame.Dao;

import com.chessSite.ChessGame.Model.ChessPlayer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChessPlayerRepo extends CrudRepository<ChessPlayer, Integer> {


}
