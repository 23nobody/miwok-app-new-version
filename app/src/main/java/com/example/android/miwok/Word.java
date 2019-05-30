package com.example.android.miwok;

import static java.sql.Types.NULL;

public class Word {
    private String mMiwokTranslation;
    private String mEnglishTranslation;
    private int mImageResourceId;

    public Word(String englishTranslation, String MiwokTranslation) {
        mEnglishTranslation = englishTranslation;
        mMiwokTranslation = MiwokTranslation;
        mImageResourceId=NULL;
    }
    public Word(String englishTranslation, String MiwokTranslation,int ImageResourceId) {
        mEnglishTranslation = englishTranslation;
        mMiwokTranslation = MiwokTranslation;
        mImageResourceId = ImageResourceId;
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
}