package com.nthieu.music_19.data.source.remote;

import com.nthieu.music_19.data.interator.GetDataInteractor;
import com.nthieu.music_19.data.model.Song;
import com.nthieu.music_19.data.source.SongDataSource;
import com.nthieu.music_19.utils.Utils;

public class SongRemoteDataSource implements SongDataSource.RemoteDataSource {

    public SongRemoteDataSource() {
    }

    @Override
    public void getSongs(String genre, int limit, int offset, SongDataSource.OnFetchDataListener<Song> listener) {
        GetDataInteractor getDataInteractor = new GetDataInteractor(listener);
        String url = Utils.createUrlContent(genre, limit, offset);
        getDataInteractor.loadData(url);
    }
}
