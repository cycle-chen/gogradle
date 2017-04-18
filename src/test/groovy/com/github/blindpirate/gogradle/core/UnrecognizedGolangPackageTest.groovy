package com.github.blindpirate.gogradle.core

import org.junit.Test

import static com.github.blindpirate.gogradle.core.UnrecognizedGolangPackage.of

class UnrecognizedGolangPackageTest {
    UnrecognizedGolangPackage unrecognizedGolangPackage = of('golang/x')

    @Test
    void 'path longer than unrecognized package should be empty'() {
        assert !unrecognizedGolangPackage.resolve('golang/x/tools').isPresent()
    }

    @Test
    void 'path shorter than unrecognized package should also be unrecognized'() {
        assert unrecognizedGolangPackage.resolve('golang').get() instanceof UnrecognizedGolangPackage
    }

    @Test
    void 'toString() should succeed'() {
        assert unrecognizedGolangPackage.toString() == "UnrecognizedGolangPackage{path='golang/x'}"
    }

    @Test
    void 'equality check should succeed'() {
        assert unrecognizedGolangPackage == unrecognizedGolangPackage
        assert unrecognizedGolangPackage != null
        assert unrecognizedGolangPackage != StandardGolangPackage.of("golang/x")
        assert unrecognizedGolangPackage == of('golang/x')
    }
}
