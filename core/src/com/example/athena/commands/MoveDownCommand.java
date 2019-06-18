package com.example.athena.commands;

import com.example.athena.model.Entity;

public class MoveDownCommand implements Command {

    @Override
    public void execute(final Entity entity) {
        entity.setY(entity.getY() - 1);
    }
}
