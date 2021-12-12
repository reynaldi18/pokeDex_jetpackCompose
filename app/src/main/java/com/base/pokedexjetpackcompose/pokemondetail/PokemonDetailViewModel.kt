package com.base.pokedexjetpackcompose.pokemondetail

import androidx.lifecycle.ViewModel
import com.base.pokedexjetpackcompose.data.remote.responses.Pokemon
import com.base.pokedexjetpackcompose.repository.PokemonRepository
import com.base.pokedexjetpackcompose.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String) : Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }
}