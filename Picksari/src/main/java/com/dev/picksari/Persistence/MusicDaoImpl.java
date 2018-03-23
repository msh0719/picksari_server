package com.dev.picksari.Persistence;

import com.dev.picksari.Domain.musicVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import javax.inject.Inject;
import java.util.List;

@Repository
public class MusicDaoImpl implements MusicDao {

    @Inject
    private SqlSession session;

    private String namespace = "com.dev.picksari.musicMapper";


    @Override
    public List<musicVO> octave_musicList(String mOctave) throws Exception {
        return session.selectList(namespace + ".octave_musicList", mOctave);
    }

    @Override
    public List<musicVO> musicList() throws Exception {
        return session.selectList(namespace + ".musicList");
    }


}
