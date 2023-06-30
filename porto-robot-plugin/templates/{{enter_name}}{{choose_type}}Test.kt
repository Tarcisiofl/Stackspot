package br.com.portoseguro.authfy.camera.presentation.entry

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import br.com.portoseguro.portobot.koin.KoinTestRule
import br.com.portoseguro.portobot.robot.ActivityRobot
import br.com.portoseguro.portobot.robot.ext.completeDef
import br.com.portoseguro.portobot.robot.ext.launch
import org.junit.Rule
import org.junit.Test

internal class {{enter_name}}{{choose_type}}Test : ActivityRobot() {

    @get:Rule
    val koinTestRule = KoinTestRule()

    @get:Rule
    val instantExecutorRule = InstantTaskExecutorRule()

    override val activity = Activity::class

    override val arrangement = completeDef<{{enter_name}}{{choose_type}}Def, {{enter_name}}{{choose_type}}Act, {{enter_name}}{{choose_type}}Ast>()

    override fun setup() {
        super.setup()
    }
}