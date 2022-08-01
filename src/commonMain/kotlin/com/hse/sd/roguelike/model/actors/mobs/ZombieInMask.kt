package com.hse.sd.roguelike.model.actors.mobs

import com.hse.sd.roguelike.model.Position
import com.hse.sd.roguelike.model.actors.mobs.strategies.Strategy

class ZombieInMask(position: Position, hp: Int, power: Int, keepExp: Int, strategy: Strategy) :
    Mob(position, hp, power, keepExp, strategy), Cowardly {
    override val type: MobType
        get() = MobType.ZOMBIE_IN_MASK
}
