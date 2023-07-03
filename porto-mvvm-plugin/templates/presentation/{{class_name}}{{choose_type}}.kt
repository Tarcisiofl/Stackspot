internal class {{class_name}}{{choose_type}} : AppCompatActivity() {

    private val viewModel by viewModel<{{class_name}}{{choose_type}}ViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setupState()
        setupAction()
    }

    private fun setupState() {
        viewModel.stateObserver.observe(this) {
            // Renderização do estado.
        }
    }

    private fun setupAction() {
        viewModel.actionEvent.observe(this) {
            // Notificação da ação.
        }
    }
}
