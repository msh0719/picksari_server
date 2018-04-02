package com.dev.picksari.Service;

import com.dev.picksari.Domain.MusicVO;
import com.dev.picksari.Persistence.MusicDao;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class MusicServiceImpl implements MusicService{
    @Inject
    private MusicDao dao;

    @Override
    public List<MusicVO> octave_musicList(String mOctave) throws Exception {
        return dao.octave_musicList(mOctave);
    }

    @Override
    public List<MusicVO> genre_musicList(String mOctave, String mGenre) throws Exception {
        return dao.genre_musicList(mOctave, mGenre);
    }

    @Override
    public List<MusicVO> musicList() throws Exception {
        return dao.musicList();
    }

    @Override
    public void register_music(MusicVO musicVO) {
        try {
            if(dao.check_music(musicVO.getmName(),musicVO.getmSinger(),musicVO.getmOctave(),musicVO.getmGenre())==0){
                dao.register_music(musicVO);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
