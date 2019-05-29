package com.example.android.miwok;

public class Word {
    private String mMiwokTranslation;
    private String mEnglishTranslation;

    public Word(String englishTranslation, String MiwokTranslation) {
        mEnglishTranslation = englishTranslation;
        mMiwokTranslation = MiwokTranslation;
    }
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
    public String getEnglishTranslation(){
        return mEnglishTranslation;
    }
}