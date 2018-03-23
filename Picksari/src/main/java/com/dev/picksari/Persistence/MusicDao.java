package com.dev.picksari.Persistence;

import com.dev.picksari.Domain.musicVO;

import java.util.List;

public interface MusicDao {
    public List<musicVO> octave_musicList(String mOctave) throws Exception;
    public List<musicVO> musicList() throws Exception;

}
