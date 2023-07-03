internal class {{class_name}}{{choose_type}}ViewModel : ViewModel() {

    private val action = SingleLiveEvent<{{class_name}}{{choose_type}}Action>()
    val actionEvent: LiveData<{{class_name}}{{choose_type}}Action> = action

    private val state = MutableLiveData<{{class_name}}{{choose_type}}State>()
    val stateObserver: LiveData<{{class_name}}{{choose_type}}State> = state
}