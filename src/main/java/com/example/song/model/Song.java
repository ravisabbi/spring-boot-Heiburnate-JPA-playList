/*
 * 
 * You can use the following import statements
 * 
 * import javax.persistence.*;
 * 
 */

// Write your code here
package com.example.song.model;

import javax.persistence.*;
@Entity
@Table(name = "playlist")
public class Song{
    @Id
    @Column(name = "songid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int songId;
    @Column(name = "songname")
    private String songName;
    @Column(name = "singer")
    private String singer;
    @Column(name = "lyricist")
    private String lyricist;
    @Column(name = "musicdirector")
    private String musicDirector;
    public Song(){}
    public Song(int songId,String songName,String singer,String lyricist,String musicDirector){
          this.songId = songId;
          this.songName = songName;
          this.singer = singer;
          this.lyricist = lyricist;
          this.musicDirector = musicDirector;

    }

    public int getSongId(){
        return this.songId;
    }
    public void setSongId(int songId){
        this.songId = songId;
    }

    public String getSongName(){
        return this.songName;
    }
    public void setSongName(String songName){
        this.songName = songName;
    }

    public String getSinger(){
        return this.singer;
    }
    public void setSinger(String singer){
        this.singer = singer;
    }

    public String getLyricist(){
        return this.lyricist;
    }
    public void setLyricist(String lyricist){
        this.lyricist = lyricist;
    }

    public String getMusicDirector(){
        return this.musicDirector;
    }
    public void setMusicDirector(String musicDirector){
        this.musicDirector = musicDirector;
    }


}
