package com.nthieu.music_19.data.source.local;

import android.content.Context;

import com.nthieu.music_19.data.interator.GetSongLocalIteractor;
import com.nthieu.music_19.data.model.Song;
import com.nthieu.music_19.data.source.SongDataSource;

public class SongLocalDataSource implements SongDataSource.LocalDataSource {
    private GetSongLocalIteractor mGetSongLocalInteractor;

    public SongLocalDataSource(Context context) {
        mGetSongLocalInteractor = new GetSongLocalIteractor(context);
    }

    @Override
    public void getSongs(SongDataSource.OnGetDataListener<Song> listener) {
        mGetSongLocalInteractor.getAllSong(listener);
    }
}
