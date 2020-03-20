package pl.allegro.finance.tradukisto.internal.languages.hindi;

import pl.allegro.finance.tradukisto.internal.BaseValues;
import pl.allegro.finance.tradukisto.internal.languages.GenderForms;
import pl.allegro.finance.tradukisto.internal.languages.PluralForms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static pl.allegro.finance.tradukisto.internal.support.BaseNumbersBuilder.baseNumbersBuilder;

public class HindiValues implements BaseValues {

    @Override
    public Map<Integer, GenderForms> baseNumbers() {
        return baseNumbersBuilder()
                .put(0, "शून्य")
                .put(1, "एक")
                .put(2, "दो")
                .put(3, "तीन")
                .put(4, "चार")
                .put(5, "पांच")
                .put(6, "छह")
                .put(7, "सात")
                .put(8, "आठ")
                .put(9, "नौ")
                .put(10, "दस")
                .put(11, "ग्यारह")
                .put(12, "बारह")
                .put(13, "तेरह")
                .put(14, "चौदह")
                .put(15, "पंद्रह")
                .put(16, "सोलह")
                .put(17, "सत्रह")
                .put(18, "अठारह")
                .put(19, "उन्नीस")
                .put(20, "बीस")
                .put(21, "इकीस")
                .put(22, "बाईस")
                .put(23, "तेईस")
                .put(24, "चौबीस")
                .put(25, "पच्चीस")
                .put(26, "छब्बीस")
                .put(27, "सत्ताईस")
                .put(28, "अट्ठाइस")
                .put(29, "उनतीस")
                .put(30, "तीस")
                .put(31, "इकतीस")
                .put(32, "बत्तीस")
                .put(33, "तैंतीस")
                .put(34, "चौंतीस")
                .put(35, "पैंतीस")
                .put(36, "छत्तीस")
                .put(37, "सैंतीस")
                .put(38, "अड़तीस")
                .put(39, "उनतालीस")
                .put(40, "चालीस")
                .put(41, "इकतालीस")
                .put(42, "बयालीस")
                .put(43, "तैंतालीस")
                .put(44, "चवालीस")
                .put(45, "पैंतालीस")
                .put(46, "छयालिस")
                .put(47, "सैंतालीस")
                .put(48, "अड़तालीस")
                .put(49, "उनचास")
                .put(50, "पचास")
                .put(51, "इक्यावन")
                .put(52, "बावन")
                .put(53, "तिरेपन")
                .put(54, "चौवन")
                .put(55, "पचपन")
                .put(56, "छप्पन")
                .put(57, "सतावन")
                .put(58, "अठावन")
                .put(59, "उनसठ")
                .put(60, "साठ")
                .put(61, "इकसठ")
                .put(62, "बासठ")
                .put(63, "तिरसठ")
                .put(64, "चौंसठ")
                .put(65, "पैंसठ")
                .put(66, "छियासठ")
                .put(67, "सड़सठ")
                .put(68, "अड़सठ")
                .put(69, "उनहतर")
                .put(70, "सत्तर")
                .put(71, "इकहत्तर")
                .put(72, "बहतर")
                .put(73, "बहत्तर")
                .put(74, "चौहत्तर")
                .put(75, "पचहत्तर")
                .put(76, "छिहत्तर")
                .put(77, "सतहत्तर")
                .put(78, "अठहत्तर")
                .put(79, "उन्नासी")
                .put(80, "अस्सी")
                .put(81, "इक्यासी")
                .put(82, "बयासी")
                .put(83, "तिरासी")
                .put(84, "चौरासी")
                .put(85, "पचासी")
                .put(86, "छियासी")
                .put(87, "सतासी")
                .put(88, "अट्ठासी")
                .put(89, "नवासी")
                .put(90, "नब्बे")
                .put(91, "इक्यानबे")
                .put(92, "बानबे")
                .put(93, "तिरानबे")
                .put(94, "चौरानबे")
                .put(95, "पंचानबे")
                .put(96, "छियानबे")
                .put(97, "सत्तानबे")
                .put(98, "अट्ठानबे")
                .put(99, "निन्यानबे")
                .put(100, "एक सौ")
                .put(200, "दो सौ")
                .put(300, "तीन सौ")
                .put(400, "चार सौ")
                .put(500, "पांच सौ")
                .put(600, "छह सौ")
                .put(700, "सात सौ")
                .put(800, "आठ सौ")
                .put(900, "नौ सौ")
                .put(1000, "एक हज़ार")
                .build();
    }

    @Override
    public List<PluralForms> pluralForms() {
        return Arrays.asList(
                new HindiPluralForms(""),
                new HindiPluralForms("हज़ार"),
                new HindiPluralForms("लाख"),
                new HindiPluralForms("करोड़"),
                new HindiPluralForms("अरब"),
                new HindiPluralForms("खरब"),
                new HindiPluralForms("नील"));
    }

    @Override
    public String currency() {
        return "रु";
    }

    @Override
    public char twoDigitsNumberSeparator() {
        return '-';
    }
}
