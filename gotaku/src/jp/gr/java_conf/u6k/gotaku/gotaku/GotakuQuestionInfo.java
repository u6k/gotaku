
package jp.gr.java_conf.u6k.gotaku.gotaku;

import java.util.ArrayList;
import java.util.List;

class GotakuQuestionInfo implements IGotakuQuestionInfo {

    private long _id;

    private long _genreId;

    private String _question;

    private List<String> _answerList = new ArrayList<String>();

    public GotakuQuestionInfo() {
    }

    @Override
    public long getId() {
        return this._id;
    }

    public void setId(long id) {
        this._id = id;
    }

    @Override
    public long getGenreId() {
        return this._genreId;
    }

    public void setGenreId(long genreId) {
        this._genreId = genreId;
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

}
