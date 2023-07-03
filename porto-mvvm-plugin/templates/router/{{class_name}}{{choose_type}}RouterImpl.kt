class {{class_name}}{{choose_type}}RouterImpl {
    override fun getIntent(context: Context): Intent {
        return context.createIntent<{{class_name}}{{choose_type}}>()
    }
}