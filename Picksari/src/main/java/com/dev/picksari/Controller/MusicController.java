package com.dev.picksari.Controller;

import com.dev.picksari.Domain.musicVO;
import com.dev.picksari.Persistence.MusicDao;
import com.dev.picksari.Service.MusicService;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@Controller
public class musicController {

    private static final Logger logger = LoggerFactory.getLogger(musicController.class);

    @Inject
    private MusicService musicService;

    @ResponseBody
    @RequestMapping("/list")
    public List<musicVO> musiclistGet(Model model) throws Exception {

        logger.info("music list...");

        List<musicVO> musics = musicService.musicList();


        return musics;
    }

    @ResponseBody
    @RequestMapping(value = "/octave_list", method = RequestMethod.POST)
    public List<musicVO> octave_musiclistGet(@RequestBody musicVO mu) throws Exception {

        logger.info("find octave..");
        List<musicVO> musics = musicService.octave_musicList(mu.getmOctave());


        return musics;
    }

    @RequestMapping(value = "/test")
    public String test(){

        return "hello world";
    }
}

