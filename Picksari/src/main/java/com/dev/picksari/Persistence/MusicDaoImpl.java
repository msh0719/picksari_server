package com.dev.picksari.Persistence;

import com.dev.picksari.Domain.MusicVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import javax.inject.Inject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class MusicDaoImpl implements MusicDao {

    @Inject
    private SqlSession session;

    private String namespace = "com.dev.picksari.recommendMapper";
    private String namespace1 = "com.dev.picksari.musicMapper";


    @Override
    public List<MusicVO> octave_musicList(String mOctave) throws Exception {
        return session.selectList(namespace + ".octave_musicList", mOctave);
    }

    @Override
    public List<MusicVO> genre_musicList(String mOctave, String mGenre) throws Exception {
        return session.selectList(namespace + ".genre_musicList");
    }

    @Override
    public List<MusicVO> musicList() throws Exception {
        return session.selectList(namespace + ".musicList");
    }

    @Override
    public int check_music(String mName, String mSinger, String mOctave, String mGenre) throws Exception {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("mName", mName);
        param.put("mSinger", mSinger);
        param.put("mOctave", mOctave);
        param.put("mGenre", mGenre);
        return session.selectOne(namespace1 + ".check", param);
    }


    @Override
    public void register_music(MusicVO musicVO) throws Exception{
        session.insert(namespace1 +".register_music", musicVO);
    }


}
