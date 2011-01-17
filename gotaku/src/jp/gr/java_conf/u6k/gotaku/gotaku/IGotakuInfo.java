
package jp.gr.java_conf.u6k.gotaku.gotaku;

import java.util.List;

public interface IGotakuInfo {

    long getId();

    String getName();

    List<IGotakuGenreInfo> getGenreList();

}
