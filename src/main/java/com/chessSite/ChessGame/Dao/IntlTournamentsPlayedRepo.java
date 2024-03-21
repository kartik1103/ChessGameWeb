package com.chessSite.ChessGame.Dao;

import com.chessSite.ChessGame.Model.IntlTournamentsPlayed;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IntlTournamentsPlayedRepo extends CrudRepository<IntlTournamentsPlayed, Integer> {

    @Query(value = "Select tournament_id, tournament_name, tournament_location" +
            ", tournament_total_matches, tournament_matches_won, tournament_matches_lost" +
            ", tournament_matches_drawn, net_points, chess_id from tournament_list" +
            " where chess_id = :chessId ",nativeQuery = true)
    public List<IntlTournamentsPlayed> getDatafromChessId(@Param("chessId") int chessId);
}
