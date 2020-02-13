package com.ziad.common_di

import javax.inject.Scope
import kotlin.annotation.MustBeDocumented

/**
 * In Dagger, an unscoped component cannot depend on a scoped component. As
 * [com.trycircle.dagger.AppComponent] is a scoped component (`@Singleton`, we create a custom
 * scope to be used by all fragment components. Additionally, a component with a specific scope
 * cannot have a sub component with the same scope.
 */
@MustBeDocumented
@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class FragmentScope
