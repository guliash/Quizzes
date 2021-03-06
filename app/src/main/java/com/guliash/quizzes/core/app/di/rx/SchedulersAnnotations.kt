package com.guliash.quizzes.core.app.di.rx

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class Main

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class IO

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class Computation