package ru.granby.tabukan.model.business.interactor.keys;

import java.util.ArrayList;
import java.util.List;

public class SingleplayerKey {
    public static final String SUFFIX = "_SINGLEPLAYER";

    public static final String FIRST_LAUNCH = "FIRST_LAUNCH" + SUFFIX;
    public static final boolean FIRST_LAUNCH_DEFAULT_VALUE = true;

    public static final String CARDS_COUNT = "CARDS_COUNT" + SUFFIX;

    public static final String CURRENT_CARD_INDEX = "CURRENT_CARD_INDEX" + SUFFIX;
    public static final int CURRENT_CARD_INDEX_DEFAULT_VALUE = 0;

    public static final String CARD = "CARD" + SUFFIX;

    public static final String CURRENT_CARD = "CURRENT_CARD" + SUFFIX;

    public static final String LAST_ASSOCIATION_INDEX = "LAST_ASSOCIATION_INDEX" + SUFFIX;
    public static final int LAST_ASSOCIATION_INDEX_DEFAULT_VALUE = 0;

    public static final String CURRENT_SELECT_LETTERS = "CURRENT_SELECT_LETTERS" + SUFFIX;
    public static final List<Character> CURRENT_SELECT_LETTERS_DEFAULT_VALUE = new ArrayList<>();

    public static final String CURRENT_WORD_LETTERS = "CURRENT_WORD_LETTERS" + SUFFIX;
    public static final List<Character> CURRENT_WORD_LETTERS_DEFAULT_VALUE = new ArrayList<>();

    public static final String CARDS_COUNT_AFTER_INTERSTITIAL_AD = "CARDS_AFTER_INTERSTITIAL_AD" + SUFFIX;
    public static final int CARDS_COUNT_AFTER_INTERSTITIAL_AD_DEFAULT_VALUE = 1;

    public static final String REMOVE_NEEDLESS_SELECT_LETTERS_USED = "REMOVE_NEEDLESS_SELECT_LETTERS_USED";
    public static final boolean REMOVE_NEEDLESS_SELECT_LETTERS_USED_DEFAULT_VALUE = false;
}
