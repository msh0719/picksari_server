package com.dev.picksari.Controller;

import com.dev.picksari.Domain.musicVO;
import com.dev.picksari.Service.MusicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.inject.Inject;
import java.util.List;

@Controller
public class musicController {

    private static final Logger logger = LoggerFactory.getLogger(musicController.class);

    @Inject
    private MusicService musicService;

    @RequestMapping("/list")
    public String musiclistGet(Model model) throws Exception {

        logger.info("music list...");

        List<musicVO> musics = musicService.musicList();
        model.addAttribute("musics", musics);

        return "/list";

    }

    @RequestMapping(value = "/octave_list", method = RequestMethod.GET)
    public String octave_musiclistGet(@RequestParam("mOctave") String mOctave, Model model) throws Exception {

        logger.info("find octave..");
        List<musicVO> musics = musicService.octave_musicList(mOctave);
        model.addAttribute("musics", musics);

        return "/octave_list";
    }
}



