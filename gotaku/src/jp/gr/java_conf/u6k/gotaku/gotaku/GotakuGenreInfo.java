
package jp.gr.java_conf.u6k.gotaku.gotaku;

import java.util.ArrayList;
import java.util.List;

import android.os.Parcel;
import android.os.Parcelable;

public class GotakuGenreInfo implements IGotakuGenreInfo {

    private String _name;

    private List<IGotakuQuestionInfo> _questionList = new ArrayList<IGotakuQuestionInfo>();

    private int _count;

    private int _offset;

    public GotakuGenreInfo() {
    }

    @Override
    public String getName() {
        return this._name;
    }

    public void setName(String name) {
        this._name = name;
    }

    @Override
    public List<IGotakuQuestionInfo> getQuestionList() {
        return this._questionList;
    }

    public void setQuestionList(List<IGotakuQuestionInfo> questionList) {
        this._questionList = questionList;
    }

    public int getCount() {
        return this._count;
    }

    public void setCount(int count) {
        this._count = count;
    }

    public int getOffset() {
        return this._offset;
    }

    public void setOffset(int offset) {
        this._offset = offset;
    }

    /*
     * ここからParcelの実装。
     */

    public static final Parcelable.Creator<GotakuGenreInfo> CREATOR = new Creator<GotakuGenreInfo>() {

        @Override
        public GotakuGenreInfo[] newArray(int size) {
            return new GotakuGenreInfo[size];
        }

        @Override
        public GotakuGenreInfo createFromParcel(Parcel in) {
            return new GotakuGenreInfo(in);
        }
    };

    private GotakuGenreInfo(Parcel in) {
        this._name = in.readString();

        int size = in.readInt();

        for (int i = 0; i < size; i++) {
            IGotakuQuestionInfo question = in.readParcelable(this.getClass().getClassLoader());
            this._questionList.add(question);
        }

        this._count = in.readInt();

        this._offset = in.readInt();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this._name);

        dest.writeInt(this._questionList.size());

        for (IGotakuQuestionInfo question : this._questionList) {
            dest.writeParcelable(question, flags);
        }

        dest.writeInt(this._count);

        dest.writeInt(this._offset);
    }

}
