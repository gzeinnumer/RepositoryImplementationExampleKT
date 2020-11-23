# RepositoryImplementationExample

- Implementation
```gradle
implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0"
implementation "androidx.activity:activity-ktx:1.1.0"
```

- Interface
```kotlin
interface DummyRepository {
    val stringRepository: LiveData<String>
}
```

- Repository Implementation
```kotlin
class DummyRepositoryImpl : DummyRepository {
    override val stringRepository: LiveData<String>
        get() {
            val str = MutableLiveData<String>()
            str.value = "String From DummyRepositoryImpl"
            return str
        }
}
```

- ViewModel
```kotlin
class MainVM : ViewModel() {
    var repository: DummyRepositoryImpl = DummyRepositoryImpl()

    val data: LiveData<String>
        get() = repository.stringRepository

}
```

- MainActivity
```kotlin
private val model: MainVM by viewModels()

model.data.observe(this, object : Observer<String>{
    override fun onChanged(s: String?) {
        Log.d(TAG, "onChanged: $s")
    }
})
```

---

```
Copyright 2020 M. Fadli Zein
```