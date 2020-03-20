package pl.allegro.finance.tradukisto.internal.languages.hindi

import spock.lang.Specification
import spock.lang.Unroll

import static pl.allegro.finance.tradukisto.internal.Container.englishContainer
import static pl.allegro.finance.tradukisto.internal.Container.hindiContainer

class HindiValuesTest extends Specification {

    static converter = hindiContainer().getNumbersConverter()

    @Unroll
    def "should convert #value to '#words' in English"() {
        expect:
        converter.asWords(value) == words

        where:
        value         | words
        0             | "शून्य"

        1_000         | "एक हज़ार"
        2_000         | "दो हज़ार"
        7_634         | "सात हज़ार छह सौ चौंतीस"
        11_000        | "ग्यारह हज़ार"
        24_190        | "चौबीस हज़ार एक सौ नब्बे"
        6_53_000       | "छह लाख तिरेपन हज़ार"
        123_454       | "एक लाख तेईस हज़ार चार सौ चौवन"
        10_23_454       | "दस लाख तेईस हज़ार चार सौ चौवन"
        700_000       | "सात लाख"
        999_999       | "नौ लाख निन्यानबे हज़ार नौ सौ निन्यानबे"

        1_000_000     | "दस लाख"
        2_000_000     | "बीस लाख"
        5_000_000     | "पचास लाख"
        23_437_219    | "दो करोड़ चौंतीस लाख सैंतीस हज़ार दो सौ उन्नीस"
        100_000_000   | "दस करोड़"
        123_456_789   | "बारह करोड़ चौंतीस लाख छप्पन हज़ार सात सौ नवासी"
        322_089_890   | "बत्तीस करोड़ बीस लाख नवासी हज़ार आठ सौ नब्बे"

        1_000_000_000 | "एक अरब"
        2_147_483_647 | "दो अरब चौदह करोड़ चौहत्तर लाख तिरासी हज़ार छह सौ सैंतालीस"
    }
}
