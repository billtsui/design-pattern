/*
 * Copyright (C) 2023 Bill Tsui <dhubilltsui@gmail.com>
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
package person.billtsui.designpattern.chain_of_responsibility;

/**
 * @author Bill Tsui <dhubilltsui@gmail.com>
 * @version 1.0.0
 * @date Mar 8, 2023
 * @description 执行点基类。执行点就是职责链上的执行点位
 */
public abstract class AbstractExecutionPoint {

    private AbstractExecutionPoint next;

    /**
     * 构建职责链
     *
     * @param first 链的起始节点
     * @param executionPoints 后续节点
     */
    public static void link(AbstractExecutionPoint first, AbstractExecutionPoint... executionPoints) {
        AbstractExecutionPoint head = first;
        for (AbstractExecutionPoint nextExecutionPoint : executionPoints) {
            head.next = nextExecutionPoint;
            head = nextExecutionPoint;
        }
    }

    /**
     * 抽象的执行方法，子类实现具体的功能
     */
    public abstract void exec();

    /**
     * 执行下一个point
     */
    public void execNext() {
        if (null != next) {
            next.exec();
        }
    }
}
