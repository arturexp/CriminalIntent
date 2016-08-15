package ru.arturexp.criminalintent;

import java.util.UUID;

public class Crime {

    private UUID mId;
    private String mTitle;

    public Crime() {
// Генерирование уникального идентификатора
        mId = UUID.randomUUID();
    }
}
