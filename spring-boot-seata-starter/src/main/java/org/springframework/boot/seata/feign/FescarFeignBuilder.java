/*
 * Copyright (C) 2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.boot.seata.feign;

import feign.Feign;
import org.springframework.beans.factory.BeanFactory;

/**
 * 
 * @author zcb
 * @date 2019年4月9日 上午10:26:37
 */
final class FescarFeignBuilder {

	private FescarFeignBuilder() {
	}

	static Feign.Builder builder(BeanFactory beanFactory) {
		return Feign.builder().client(new FescarFeignClient(beanFactory));
	}
}
