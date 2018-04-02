package com.dev.picksari.Controller;

import com.dev.picksari.Domain.MusicVO;
import com.dev.picksari.Service.MusicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.List;

@Controller
public class musicController {

    private static final Logger logger = LoggerFactory.getLogger(musicController.class);

    @Inject
    private MusicService musicService;

    @ResponseBody
    @RequestMapping("/list")
    public List<MusicVO> musiclistGet(Model model) throws Exception {

        logger.info("music list...");

        List<MusicVO> musics = musicService.musicList();


        return musics;
    }

    @ResponseBody
    @RequestMapping(value = "/octave_list", method = RequestMethod.POST)
    public List<MusicVO> octave_musiclistGet(@RequestBody MusicVO mu) throws Exception {

        logger.info("find octave..");
        List<MusicVO> musics = musicService.octave_musicList(mu.getmOctave());
        System.out.println("옥타브는 " + mu.getmOctave());
        System.out.println("사이즈는 " + musics.size());

        return musics;
    }

    @ResponseBody
    @RequestMapping(value = "/genre_musicList", method = RequestMethod.POST)
    public List<MusicVO> genre_musiclistGet(@RequestBody MusicVO mu) throws Exception {

        logger.info("find octave..");
        List<MusicVO> musics = musicService.genre_musicList(mu.getmOctave(), mu.getmGenre());

        System.out.println("장르는 " + mu.getmGenre());
        System.out.println("사이즈는 " + musics.size());

        return musics;
    }

    @RequestMapping(value = "/register_music", method = RequestMethod.POST)
    public void register_music(@RequestBody MusicVO mu) throws Exception{

        logger.info("music register...");
        MusicVO musicVO = new MusicVO();
        musicVO.setmName(mu.getmName());
        musicVO.setmSinger(mu.getmSinger());
        musicVO.setmOctave(mu.getmOctave());
        musicVO.setmGenre(mu.getmGenre());
        musicService.register_music(musicVO);

    }
}

