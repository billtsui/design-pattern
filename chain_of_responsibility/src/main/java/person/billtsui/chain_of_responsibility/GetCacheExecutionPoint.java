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

package person.billtsui.chain_of_responsibility;

/**
 * @author Bill Tsui <dhubilltsui@gmail.com>
 * @version 1.0.0
 * @date Mar 8, 2023
 * @description
 */
public class GetCacheExecutionPoint extends AbstractExecutionPoint {

    /**
     * 从Redis中获取数据
     */
    @Override
    public void exec() {
        System.out.println("Get cache from Redis.");
        this.execNext();
    }
}