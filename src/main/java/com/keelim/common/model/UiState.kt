package com.keelim.common.model

data class DataUiState<T>(
    val isLoading: Boolean = false,
    val throwable: Throwable? = null,
    val value: T? = null,
) {
    val isError: Boolean
        get() = throwable != null

    fun getOrDefault(default: T): T {
        return value ?: default
    }

    companion object{
        fun <T> loading(): DataUiState<T> {
            return DataUiState(isLoading = true)
        }
        fun <T> success(value:T): DataUiState<T> {
            return DataUiState(value = value)
        }
        fun <T> error(throwable: Throwable): DataUiState<T> {
            return DataUiState(throwable = throwable)
        }
    }
}

sealed class SealedUiState<out T>{
    data class Loading<T>(val value: T?): SealedUiState<T>()
    data class Error(val throwable : Throwable?) : SealedUiState<Nothing>()
    data class Success<T>(val value: T): SealedUiState<T>()

    fun getOrDefault(defaultValue : @UnsafeVariance T): T {
        return if(this is Success){
            value
        }else {
            defaultValue
        }
    }

    companion object {
        fun <T> success(value : T): SealedUiState<T> {
            return Success(value)
        }
        fun <T> loading() : SealedUiState<T> {
            return Loading(null)
        }
        fun <T> error(throwable: Throwable) : SealedUiState<T> {
            return Error(throwable)
        }
    }
}
