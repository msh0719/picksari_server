package com.dev.picksari.Service;

import com.dev.picksari.Domain.musicVO;
import com.dev.picksari.Persistence.MusicDao;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class MusicServiceImpl implements MusicService{
    @Inject
    private MusicDao dao;

    @Override
    public List<musicVO> octave_musicList(String mOctave) throws Exception {
        return dao.octave_musicList(mOctave);
    }

    @Override
    public List<musicVO> musicList() throws Exception {
        return dao.musicList();
    }
}
