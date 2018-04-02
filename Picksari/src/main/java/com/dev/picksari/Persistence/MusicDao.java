package com.dev.picksari.Persistence;

import com.dev.picksari.Domain.MusicVO;

import java.util.List;

public interface MusicDao {
    public List<MusicVO> octave_musicList(String mOctave) throws Exception;
    public List<MusicVO> genre_musicList(String mOctave, String mGenre) throws Exception;
    public List<MusicVO> musicList() throws Exception;
    public int check_music(String mName, String mSinger, String mOctave, String mGenre) throws Exception;
    public void register_music(MusicVO musicVO) throws  Exception;
}
