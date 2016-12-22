package com.github.blindpirate.gogradle.core.dependency.resolve;

import com.github.blindpirate.gogradle.core.GolangPackage;
import com.github.blindpirate.gogradle.core.GolangPackageModule;
import com.github.blindpirate.gogradle.core.dependency.GolangDependency;
import com.github.blindpirate.gogradle.core.dependency.GolangDependencySet;
import com.github.blindpirate.gogradle.general.Factory;

/**
 * A factory whose input is a {@link GolangPackageModule} and output is a set of {@link GolangDependency}.
 *
 * This directory is root directory of a {@link GolangPackage}
 */
public interface DependencyFactory extends Factory<GolangPackageModule, GolangDependencySet> {
}
