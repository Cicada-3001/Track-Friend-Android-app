package com.example.jinx;

public class FriendModel {
    //creating a friend model
    private string firstname;
    private string lastname;
    private string birthday;
    private string category;
    private string comment;
    private int profileImg;

    public FriendModel(string firstname, string lastname, string birthday, string category, string comment, int profileImg) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthday = birthday;
        this.category = category;
        this.comment = comment;
        this.profileImg = profileImg;
    }

    public string getFirstname() {
        return firstname;
    }

    public void setFirstname(string firstname) {
        this.firstname = firstname;
    }

    public string getLastname() {
        return lastname;
    }

    public void setLastname(string lastname) {
        this.lastname = lastname;
    }

    public string getBirthday() {
        return birthday;
    }

    public void setBirthday(string birthday) {
        this.birthday = birthday;
    }

    public string getCategory() {
        return category;
    }

    public void setCategory(string category) {
        this.category = category;
    }

    public string getComment() {
        return comment;
    }

    public void setComment(string comment) {
        this.comment = comment;
    }

    public int getProfileImg() {
        return profileImg;
    }

    public void setProfileImg(int profileImg) {
        this.profileImg = profileImg;
    }
}
