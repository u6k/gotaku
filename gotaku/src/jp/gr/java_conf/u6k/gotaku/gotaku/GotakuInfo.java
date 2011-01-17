
package jp.gr.java_conf.u6k.gotaku.gotaku;

import java.util.ArrayList;
import java.util.List;

class GotakuInfo implements IGotakuInfo {

    private long _id;

    private String _name;

    private List<IGotakuGenreInfo> _genreList = new ArrayList<IGotakuGenreInfo>();

    public GotakuInfo() {
    }

    @Override
    public long getId() {
        return this._id;
    }

    public void setId(long id) {
        this._id = id;
    }

    @Override
    public String getName() {
        return this._name;
    }

    public void setName(String name) {
        this._name = name;
    }

    @Override
    public List<IGotakuGenreInfo> getGenreList() {
        return this._genreList;
    }

    public void setGenreList(List<IGotakuGenreInfo> genreList) {
        this._genreList = genreList;
    }

}
