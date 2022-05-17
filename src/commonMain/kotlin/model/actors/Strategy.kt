package model.actors

import model.Environment
import model.actions.Action

// interface with strategy for mob
interface Strategy {
    val type: StrategyType

    val environment: Environment

    fun makeAct(mob: Mob): List<Action>
}
