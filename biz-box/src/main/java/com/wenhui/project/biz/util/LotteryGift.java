package com.wenhui.project.biz.util;

public class LotteryGift {
    private int index;
    private String gitfId;
    private String giftName;
    private double probability;

    public LotteryGift(int index, String gitfId, String giftName, double probability) {
        this.index = index;
        this.gitfId = gitfId;
        this.giftName = giftName;
        this.probability = probability;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getGitfId() {
        return gitfId;
    }

    public void setGitfId(String gitfId) {
        this.gitfId = gitfId;
    }

    public String getGiftName() {
        return giftName;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName;
    }

    public double getProbability() {
        return probability;
    }

    public void setProbability(double probability) {
        this.probability = probability;
    }

    @Override
    public String toString() {
        return "Gift [index=" + index + ", gitfId=" + gitfId + ", giftName=" + giftName + ", probability=" + probability + "]";
    }

}
