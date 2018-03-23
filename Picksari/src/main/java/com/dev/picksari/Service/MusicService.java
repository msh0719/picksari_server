package com.dev.picksari.Service;

import com.dev.picksari.Domain.musicVO;

import java.util.ArrayList;
import java.util.List;

public interface MusicService {

    public List<musicVO> octave_musicList(String mOctave) throws  Exception;
    public List<musicVO> musicList() throws Exception;
}
