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

package com.mayabot.nlp.dictionary.core;

import com.mayabot.nlp.MynlpInjector;
import com.mayabot.nlp.Settings;
import com.mayabot.nlp.segment.dictionary.core.CoreDictionary;
import org.junit.Test;

public class CoreDictionaryTest {


    @Test
    public void get() throws Exception {

        System.setProperty(Settings.KEY_WORK_DIR, "temp");

        CoreDictionary dictionary = MynlpInjector.getInstance(CoreDictionary.class);
        System.out.println(dictionary.get("普查"));

//        long t1 = System.currentTimeMillis();
//        System.out.println(dictionary.indexOf("人口"));
//        for (int i = 0; i < 10000000; i++) {
//
//            dictionary.instance("普查");
//            dictionary.indexOf("人口");
//
//
//        }
//        long t2 = System.currentTimeMillis();
//
//        System.out.println(t2-t1);
    }

}