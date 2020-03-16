// Generated by Dagger (https://dagger.dev).
package com.ziad.all_jokes.di;

import com.ziad.all_jokes.domain.repo.JokesRepository;
import com.ziad.all_jokes.domain.usecases.GetAllJokesUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AllJokesModule_ProvideGetAllJokes$all_jokes_debugFactory implements Factory<GetAllJokesUseCase> {
  private final AllJokesModule module;

  private final Provider<JokesRepository> jokeRepoProvider;

  public AllJokesModule_ProvideGetAllJokes$all_jokes_debugFactory(AllJokesModule module,
      Provider<JokesRepository> jokeRepoProvider) {
    this.module = module;
    this.jokeRepoProvider = jokeRepoProvider;
  }

  @Override
  public GetAllJokesUseCase get() {
    return provideGetAllJokes$all_jokes_debug(module, jokeRepoProvider.get());
  }

  public static AllJokesModule_ProvideGetAllJokes$all_jokes_debugFactory create(
      AllJokesModule module, Provider<JokesRepository> jokeRepoProvider) {
    return new AllJokesModule_ProvideGetAllJokes$all_jokes_debugFactory(module, jokeRepoProvider);
  }

  public static GetAllJokesUseCase provideGetAllJokes$all_jokes_debug(AllJokesModule instance,
      JokesRepository jokeRepo) {
    return Preconditions.checkNotNull(instance.provideGetAllJokes$all_jokes_debug(jokeRepo), "Cannot return null from a non-@Nullable @Provides method");
  }
}