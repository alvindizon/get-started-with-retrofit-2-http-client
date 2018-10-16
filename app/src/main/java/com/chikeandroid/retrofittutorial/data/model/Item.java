package com.chikeandroid.retrofittutorial.data.model;


import com.squareup.moshi.Json;

public class Item {

    @Json(name = "owner")
    private Owner owner;
    @Json(name = "is_accepted")
    private Boolean isAccepted;
    @Json(name = "score")
    private Integer score;
    @Json(name = "last_activity_date")
    private Integer lastActivityDate;
    @Json(name = "creation_date")
    private Integer creationDate;
    @Json(name = "answer_id")
    private Integer answerId;
    @Json(name = "question_id")
    private Integer questionId;
    @Json(name = "last_edit_date")
    private Integer lastEditDate;

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Boolean getIsAccepted() {
        return isAccepted;
    }

    public void setIsAccepted(Boolean isAccepted) {
        this.isAccepted = isAccepted;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getLastActivityDate() {
        return lastActivityDate;
    }

    public void setLastActivityDate(Integer lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }

    public Integer getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Integer creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Integer getLastEditDate() {
        return lastEditDate;
    }

    public void setLastEditDate(Integer lastEditDate) {
        this.lastEditDate = lastEditDate;
    }
}
