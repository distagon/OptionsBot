/*
 * TradingBot - A Java Trading system..
 * 
 * Copyright (C) 2013 Philipz (philipzheng@gmail.com)
 * http://www.tradingbot.com.tw/
 * http://www.facebook.com/tradingbot
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * Apache License, Version 2.0 授權中文說明
 * http://www.openfoundry.org/licenses/29
 * 利用 Apache-2.0 程式所應遵守的義務規定
 * http://www.openfoundry.org/tw/legal-column-list/8950-obligations-of-apache-20
 */
package jna;

import com.sun.jna.Native;
import com.sun.jna.win32.StdCallLibrary;

public interface OMSignAPI extends StdCallLibrary {
	OMSignAPI INSTANCE = (OMSignAPI)
    Native.loadLibrary("C:\\Program Files\\OrderMaster\\OMSignAPI",
    		OMSignAPI.class);
	public boolean IniDllAndPosition(String signID, int iniPosition);
	public boolean GoOrder(String signID, String bySignStr,
			String dateTimeStr, int nowPosition, double nowPrice);
}
