package {{package_name}}.{{module_name}}.presentation.{{feature_name_lower}}

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import br.com.portoseguro.portobot.koin.KoinTestRule
import br.com.portoseguro.portobot.robot.{{choose_type}}Robot
import br.com.portoseguro.portobot.robot.ext.completeDef
import br.com.portoseguro.{{module_name}}.presentation.{{feature_name_lower}}.robot.{{class_name}}Act
import br.com.portoseguro.{{module_name}}.presentation.{{feature_name_lower}}.robot.{{class_name}}Ast
import br.com.portoseguro.{{module_name}}.presentation.{{feature_name_lower}}.robot.{{class_name}}Def
import org.junit.Rule

internal class {{class_name}}Test : {{choose_type}}Robot() {

    @get:Rule
    val koinTestRule = KoinTestRule()

    @get:Rule
    val instantExecutorRule = InstantTaskExecutorRule()

    override val {{choose_type_lower}} = {{class_name}}::class

    override val arrangement = completeDef<{{class_name}}Def, {{class_name}}Act, {{class_name}}Ast>()
}