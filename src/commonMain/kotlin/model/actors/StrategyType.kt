package model.actors

import model.Environment

enum class StrategyType {
    PASSIVE {
        override fun build(environment: Environment): Strategy {
            return PassStrategy(environment)
        }
    },
    FEARFUL {
        override fun build(environment: Environment): Strategy {
            return FearfulStrategy(environment)
        }

    },
    AGGRESSIVE {
        override fun build(environment: Environment): Strategy {
            return AggressiveStrategy(environment)
        }

    },
    CONFUSED {
        override fun build(environment: Environment): Strategy {
            return ConfusedStrategy(environment)
        }

    };

    abstract fun build(environment: Environment): Strategy
}