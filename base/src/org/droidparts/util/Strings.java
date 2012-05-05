/**
 * Copyright 2012 Alex Yanchenko
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 */
package org.droidparts.util;

import java.util.Collection;

public class Strings {

	public static boolean isNotEmpty(CharSequence str) {
		return !isEmpty(str);
	}

	public static boolean isEmpty(CharSequence str) {
		return str == null || str.length() == 0;
	}

	public String toEnumeratingString(Collection<CharSequence> coll,
			boolean terminateWithDot) {
		return toEnumeratingString(
				coll.toArray(new CharSequence[coll.size()]), terminateWithDot);
	}

	public String toEnumeratingString(CharSequence[] arr,
			boolean terminateWithDot) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);
			if (i < arr.length - 1) {
				sb.append(", ");
			} else if (terminateWithDot) {
				sb.append(".");
			}
		}
		return sb.toString();
	}

	private Strings() {
	}

}
