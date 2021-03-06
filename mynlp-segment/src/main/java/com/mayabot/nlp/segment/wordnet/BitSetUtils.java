/*
 * Copyright 2018 mayabot.com authors. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.mayabot.nlp.segment.wordnet;

import java.util.BitSet;
import java.util.function.BiConsumer;

public class BitSetUtils {

    /**
     * 寻找一个或多个连续false
     *
     * @param bitSet
     */
    public static void accessBlank(int size, BitSet bitSet, BiConsumer<Integer, Integer> consumer) {
        int flag = bitSet.nextClearBit(0);
        while (flag < size) {
            int len = 1;
            while (flag + len < size && !bitSet.get(flag + len)) {
                len++;
            }
            consumer.accept(flag, len);

            flag = bitSet.nextClearBit(flag + len);
        }
    }


}
