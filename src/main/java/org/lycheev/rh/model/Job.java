package org.lycheev.rh.model;

public enum Job {
    ASSISTANT {
        @Override
        public Job getNextInTheHierarchy() {
            return ANALYST;
        }
    },
    ANALYST {
        @Override
        public Job getNextInTheHierarchy() {
            return SPECIALIST;
        }
    },
    SPECIALIST {
        @Override
        public Job getNextInTheHierarchy() {
            return MANAGER;
        }
    },
    MANAGER {
        @Override
        public Job getNextInTheHierarchy() {
            return MANAGER;
        }
    };

    public abstract Job getNextInTheHierarchy();
}
