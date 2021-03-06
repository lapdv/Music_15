package com.framgia.dattien.musicproject.screen.main.home;

import com.framgia.dattien.musicproject.data.model.Genre;
import com.framgia.dattien.musicproject.data.model.Song;
import com.framgia.dattien.musicproject.screen.BasePresenter;

import java.util.List;

/**
 * Created by tiendatbkhn on 24/05/2018.
 */

public interface HomeContract {

    interface View {

        void updateGenres(List<Genre> genres);

        void updateHotSongs(List<Song> songs);

        void showMessage(String message);
    }

    interface Presenter extends BasePresenter<HomeContract.View> {

        void getGenres();

        void getHotSongs();
    }
}
