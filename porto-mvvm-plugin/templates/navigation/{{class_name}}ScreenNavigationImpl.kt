class {{class_name}}ScreenNavigationImpl : {{class_name}}ScreenNavigation {
    override fun getIntent(context: Context): Intent {
        return context.createIntent<{{class_name}}{{choose_type}}>()
    }
}