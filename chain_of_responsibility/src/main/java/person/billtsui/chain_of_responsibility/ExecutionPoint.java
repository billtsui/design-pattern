/*
 * Copyright (C) 2023 k.cui
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package person.billtsui.chain_of_responsibility;

/**
 *
 * @author k.cui
 *
 * 执行点的基类
 */
public abstract class ExecutionPoint {

    private ExecutionPoint next;

    /**
     * 构建执行点的链条
     * @param first
     * @param executionPoints
     */
    public static void link(ExecutionPoint first, ExecutionPoint... executionPoints) {
        ExecutionPoint head = first;
        for (ExecutionPoint nextExecutionPoint : executionPoints) {
            head.next = nextExecutionPoint;
            head = nextExecutionPoint;
        }
    }

}
