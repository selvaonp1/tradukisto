package pl.allegro.finance.tradukisto.internal.languages.hindi

import pl.allegro.finance.tradukisto.internal.languages.english.EnglishPluralForms
import spock.lang.Specification

class HindiPluralFormsTest extends Specification {

    def pluralForms = new HindiPluralForms("हज़ार")

    def "should provide value for singular form"() {
        expect:
        pluralForms.formFor(value) == "हज़ार"

        where:
        value << ((0..100) as Number)
    }
}
