package com.chessSite.ChessGame.Service;

import com.chessSite.ChessGame.Dao.FriendsListRepo;
import com.chessSite.ChessGame.Model.FriendsList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FriendsListService {

    @Autowired
    private FriendsListRepo friendsListRepo;

    public FriendsList getFriendsListData(int id) throws ChangeSetPersister.NotFoundException {

        return  friendsListRepo.findById(id).orElseThrow(ChangeSetPersister.NotFoundException::new);
    }

    public FriendsList updateFriendsListData(FriendsList friendsList){
        return friendsListRepo.save(friendsList);
    }

    public FriendsList insertFriendsListData(FriendsList friendsList){
        return friendsListRepo.save(friendsList);
    }

    public int deleteFriendsListData(int id){
        friendsListRepo.deleteById(id);
        return id;
    }

    public List<FriendsList> getAllData(){
        return (List<FriendsList>) friendsListRepo.findAll();
    }

    public List<FriendsList> getFromFriendId(int friendId){
        return friendsListRepo.getFromFriendId(friendId);
    }


}
