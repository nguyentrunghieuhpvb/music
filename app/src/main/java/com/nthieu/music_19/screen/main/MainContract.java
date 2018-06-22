package com.nthieu.music_19.screen.main;

import com.nthieu.music_19.BasePresenter;
import com.nthieu.music_19.BaseView;
import com.nthieu.music_19.data.model.Song;

import java.util.List;

public class MainContract {
    interface View extends BaseView {
        void showDataSearchMusic(List<Song> list);
    }

    interface Presenter extends BasePresenter<Song> {
        void searchMusic();
    }
}
