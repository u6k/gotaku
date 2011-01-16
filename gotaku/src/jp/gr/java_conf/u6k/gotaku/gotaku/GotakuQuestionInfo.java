
package jp.gr.java_conf.u6k.gotaku.gotaku;

import java.util.ArrayList;
import java.util.List;

import android.os.Parcel;
import android.os.Parcelable;

class GotakuQuestionInfo implements IGotakuQuestionInfo {

    private String _question;

    private List<String> _answerList = new ArrayList<String>();

    public GotakuQuestionInfo() {
    }

    @Override
    public String getQuestion() {
        return this._question;
    }

    public void setQuestion(String question) {
        this._question = question;
    }

    @Override
    public List<String> getAnswerList() {
        return this._answerList;
    }

    public void setAnswerList(List<String> answerList) {
        this._answerList = answerList;
    }

    /*
     * ここからParcelの実装。
     */

    public static final Parcelable.Creator<GotakuQuestionInfo> CREATOR = new Creator<GotakuQuestionInfo>() {

        @Override
        public GotakuQuestionInfo[] newArray(int size) {
            return new GotakuQuestionInfo[size];
        }

        @Override
        public GotakuQuestionInfo createFromParcel(Parcel in) {
            return new GotakuQuestionInfo(in);
        }
    };

    private GotakuQuestionInfo(Parcel in) {
        this._question = in.readString();
        in.readStringList(this._answerList);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this._question);
        dest.writeStringList(this._answerList);
    }

}
