package com.nthieu.music_19.screen.music;

import com.nthieu.music_19.BasePresenter;
import com.nthieu.music_19.BaseView;
import com.nthieu.music_19.data.model.Song;

public class MusicContract {
    interface View extends BaseView {
        void showDowload();

        void hideDowload();
    }

    interface Presenter extends BasePresenter<View> {
        void checkDowload(Song song, String code);
    }
}
