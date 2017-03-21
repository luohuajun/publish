/*
 * JDIVisitor
 * Copyright (C) 2014  Adrian Herrera
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package com.shinemo.publish.debug.jdivisitor.event;

import com.shinemo.publish.debug.jdivisitor.event.visitor.EventVisitor;
import com.shinemo.publish.debug.jdivisitor.event.visitor.Visitable;
import com.sun.jdi.event.AccessWatchpointEvent;

/**
 * Visitable access watchpoint event.
 * 
 * @author Adrian Herrera
 * @see AccessWatchpointEvent
 */
public class VisitableAccessWatchpointEvent implements Visitable {

    private final AccessWatchpointEvent event;

    public VisitableAccessWatchpointEvent(AccessWatchpointEvent event) {
        this.event = event;
    }

    @Override
    public void accept(EventVisitor visitor) {
        visitor.visit(event);
    }
}
