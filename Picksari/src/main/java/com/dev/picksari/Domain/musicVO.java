package com.dev.picksari.Domain;

public class MusicVO {

    private int mId;
    private String mName;
    private String mSinger;
    private String mGenre;
    private String mOctave;

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmSinger() {
        return mSinger;
    }

    public void setmSinger(String mSinger) {
        this.mSinger = mSinger;
    }

    public String getmGenre() {
        return mGenre;
    }

    public void setmGenre(String mGenre) {
        this.mGenre = mGenre;
    }

    public String getmOctave() {
        return mOctave;
    }

    public void setmOctave(String mOctave) {
        this.mOctave = mOctave;
    }


    @Override
    public String toString() {
        return "MusicVO{" +
                "mId=" + mId +
                ", mName='" + mName + '\'' +
                ", mSinger='" + mSinger + '\'' +
                ", mGenre='" + mGenre + '\'' +
                ", mOctave='" + mOctave + '\'' +
                '}';
    }
}
