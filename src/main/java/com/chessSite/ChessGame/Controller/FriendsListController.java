package com.chessSite.ChessGame.Controller;

import com.chessSite.ChessGame.Model.ChessPlayer;
import com.chessSite.ChessGame.Model.FriendsList;
import com.chessSite.ChessGame.Service.FriendsListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FriendsListController {

    @Autowired
    private FriendsListService friendsListService;

    @GetMapping("/friendsList/{id}")
    public FriendsList getFriendsList(@PathVariable int id){
        try {
            return friendsListService.getFriendsListData(id);
        } catch (ChangeSetPersister.NotFoundException e) {
            return null;
        }
    }

    @PutMapping("/friendsList/update")
    public FriendsList updateFriendsList(@RequestBody FriendsList friendsList){
        return friendsListService.updateFriendsListData(friendsList);
    }

    @PostMapping("friendsList/insert")
    public FriendsList insertFriendsList(@RequestBody FriendsList friendsList){
        return friendsListService.insertFriendsListData(friendsList);
    }

    @DeleteMapping("friendsList/{id}")
    public int deleteFriendsList(@PathVariable int id){
        return friendsListService.deleteFriendsListData(id);
    }

    @GetMapping("friendsList/all")
    public List<FriendsList> getFriendsAllData(){
        return friendsListService.getAllData();
    }

    @GetMapping("friendsfromid/{id}")
    public List<FriendsList> getFriendsfromFriendId(@PathVariable int id){
        return friendsListService.getFromFriendId(id);
    }



}
