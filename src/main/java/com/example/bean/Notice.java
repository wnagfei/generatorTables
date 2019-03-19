package com.example.bean;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "notice")
public class Notice {
    private  int teaID;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
      private  Integer  noticeID=1;
    private  int stuID;
    private String title;
    private  String content;
    private Date date;
    private String openid;

    public void setOpenid(String openid) {
        this.openid = openid;
    }
    public String getOpenid(){
        return  openid;
    }

    public void setTeaID(int teaID){
        this.teaID=teaID;
    }

    public int getTeaID() {
        return teaID;
    }

    public void setStuID(int stuID) {
        this.stuID = stuID;
    }

    public int getStuID() {
        return stuID;
    }
    public String getTitle(){
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setContent(String content){
        this.content=content;
    }
    public String getContent(){
        return content;
    }
    public void setDate(Date date){
        this.date=date;
    }
    public Date getDate(){
        return date;
    }
    public  int getNoticeID(){
        return  noticeID;
    }

    public void setNoticeID(int noticeID) {
        this.noticeID = noticeID;
    }
    public void incre(){
        noticeID++;
    }
}
