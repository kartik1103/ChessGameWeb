package com.chessSite.ChessGame.Dao;

import com.chessSite.ChessGame.Model.ChessPlayer;
import com.chessSite.ChessGame.Model.FriendsList;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FriendsListRepo extends CrudRepository<FriendsList, Integer> {

    @Query(value = "Select chess_id,player_name, player_rating, no_tournaments_played" +
            ", friend_id from friends_list where friend_id = :friendId", nativeQuery = true)
    public List<FriendsList> getFromFriendId(@Param("friendId") int friendId);
}
