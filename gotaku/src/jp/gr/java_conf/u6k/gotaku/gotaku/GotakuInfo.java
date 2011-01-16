
package jp.gr.java_conf.u6k.gotaku.gotaku;

import java.util.ArrayList;
import java.util.List;

import android.os.Parcel;
import android.os.Parcelable;

class GotakuInfo implements IGotakuInfo {

    private List<IGotakuGenreInfo> _genreList = new ArrayList<IGotakuGenreInfo>();

    public GotakuInfo() {
    }

    @Override
    public List<IGotakuGenreInfo> getGenreList() {
        return this._genreList;
    }

    public void setGenreList(List<IGotakuGenreInfo> genreList) {
        this._genreList = genreList;
    }

    /*
     * ここからParcelの実装。
     */

    public static final Parcelable.Creator<GotakuInfo> CREATOR = new Parcelable.Creator<GotakuInfo>() {

        @Override
        public GotakuInfo createFromParcel(Parcel in) {
            return new GotakuInfo(in);
        }

        @Override
        public GotakuInfo[] newArray(int size) {
            return new GotakuInfo[size];
        }

    };

    private GotakuInfo(Parcel in) {
        int size = in.readInt();

        for (int i = 0; i < size; i++) {
            IGotakuGenreInfo genre = in.readParcelable(this.getClass().getClassLoader());
            this._genreList.add(genre);
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this._genreList.size());

        for (IGotakuGenreInfo genre : this._genreList) {
            dest.writeParcelable(genre, flags);
        }
    }

}
