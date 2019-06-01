package com.example.android.miwok;

import static java.sql.Types.NULL;

public class Word {
    private String mMiwokTranslation;
    private String mEnglishTranslation;
    private int mImageResourceId;
    private int mAudioResourceId;

    public Word(String englishTranslation, String MiwokTranslation, int audioRecourceId) {
        mEnglishTranslation = englishTranslation;
        mMiwokTranslation = MiwokTranslation;
        mImageResourceId=NULL;
        mAudioResourceId = audioRecourceId;
    }
    public Word(String englishTranslation, String MiwokTranslation,int ImageResourceId,int audioResourceId) {
        mEnglishTranslation = englishTranslation;
        mMiwokTranslation = MiwokTranslation;
        mImageResourceId = ImageResourceId;
        mAudioResourceId = audioResourceId;
    }
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
    public String getEnglishTranslation(){
        return mEnglishTranslation;
    }
    public int getImageResourceId(){
        return mImageResourceId;
    }
    public int getAudioResourceId(){return mAudioResourceId;}

    @Override
    public String toString() {
        return "Word{" +
                "mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mEnglishTranslation='" + mEnglishTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}