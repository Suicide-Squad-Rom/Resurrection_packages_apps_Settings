<<<<<<< HEAD
=======
/*
 * Copyright (C) 2013 Android Open Kang Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

>>>>>>> 34a5662... Settings: QuietHours AutoSMSReply && QuietHours Bypass (2/2)
package com.android.settings.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

public class BootReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
<<<<<<< HEAD
        if (CallService.returnUserCallSms(context) != 0) {
            context.startService(new Intent(context, CallService.class));
        }
        if (SmsService.returnUserTextSms(context) != 0) {
            context.startService(new Intent(context, SmsService.class));
        }
    }

=======
        SmsCallHelper.scheduleService(context);
    }
>>>>>>> 34a5662... Settings: QuietHours AutoSMSReply && QuietHours Bypass (2/2)
}
