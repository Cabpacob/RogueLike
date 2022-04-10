package model

// class that stores the model
class ModelHandler {
    private val environment =
        Environment(FloorMapGenerator(MapGeneratorConfig(10, 10)), MainCharacterConfig(Position(0, 0), 100, 0))
    private var actions = mutableListOf<Action>()

    // handles move action
    fun onMove(move: Move) {
        if (environment.canMainCharacterMove(move)) {
            val actor = environment.mainCharacter
            actions.add(ActorMoved(actor, Position(actor.position, move)))
            environment.mainCharacterMove(move)
        }
    }

    // returns all actions from last tick
    fun onTick(): List<Action> {
        val actionsFromLastTick = actions
        actions = mutableListOf()
        environment.tick()
        return actionsFromLastTick.reversed().distinctBy { action -> action.javaClass } // TODO("Ensure one ActorMoved action on list")
    }
}
