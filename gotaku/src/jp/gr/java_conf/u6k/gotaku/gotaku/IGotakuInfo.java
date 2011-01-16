
package jp.gr.java_conf.u6k.gotaku.gotaku;

import java.util.List;

import android.os.Parcelable;

public interface IGotakuInfo extends Parcelable {

    List<IGotakuGenreInfo> getGenreList();

}
