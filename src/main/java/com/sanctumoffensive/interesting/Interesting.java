package com.sanctumoffensive.interesting;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;

public class Interesting {

    public static String getDescriptionByNamePermission(String permission) {
        Map<String, String> permissions = new HashMap<>();

        permissions.put("ACCESS_CHECKIN_PROPERTIES"            , "Allows read/write access to the \"properties\" table in the checkin database, to change values that get uploaded.");
        permissions.put("ACCESS_COARSE_LOCATION"               , "Allows an app to access approximate location derived from network location sources such as cell towers and Wi-Fi.");
        permissions.put("ACCESS_FINE_LOCATION"                 , "Allows an app to access precise location from location sources such as GPS, cell towers, and Wi-Fi.");
        permissions.put("ACCESS_LOCATION_EXTRA_COMMANDS"       , "Allows an application to access extra location provider commands.");
        permissions.put("ACCESS_MOCK_LOCATION"                 , "Allows an application to create mock location providers for testing.");
        permissions.put("ACCESS_NETWORK_STATE"                 , "Allows applications to access information about networks.");
        permissions.put("ACCESS_NOTIFICATION_POLICY"           , "Marker permission for applications that wish to access notification policy.");
        permissions.put("ACCESS_SURFACE_FLINGER"               , "Allows an application to use SurfaceFlinger's low level features.");
        permissions.put("ACCESS_WIFI_STATE"                    , "Allows applications to access information about Wi-Fi networks");
        permissions.put("ACCOUNT_MANAGER"                      , "Allows applications to call into AccountAuthenticators.");
        permissions.put("ADD_VOICEMAIL"                        , "Allows an application to add voicemails into the system.");
        permissions.put("AUTHENTICATE_ACCOUNTS"                , "Allows an application to act as an AccountAuthenticator for the AccountManager.");
        permissions.put("BATTERY_STATS"                        , "Allows an application to collect battery statistics.");
        permissions.put("BIND_ACCESSIBILITY_SERVICE"           , "Must be required by an AccessibilityService,to ensure that only the system can bind to it.");
        permissions.put("BIND_APPWIDGET"                       , "Allows an application to tell the AppWidget service which application can access AppWidget\"s data.");
        permissions.put("BIND_CARRIER_MESSAGING_SERVICE"       , "The system process that is allowed to bind to services in carrier apps will have this permission. Carrier apps should use this permission to protect their services that only the system is allowed to bind to.");
        permissions.put("BIND_CHOOSER_TARGET_SERVICE"          , "Must be required by a ChooserTargetService, to ensure that only the system can bind to it.");
        permissions.put("BIND_DEVICE_ADMIN"                    , "Must be required by device administration receiver, to ensure that only the system can interact with it.");
        permissions.put("BIND_DREAM_SERVICE"                   , "Must be required by an DreamService, to ensure that only the system can bind to it.");
        permissions.put("BIND_INCALL_SERVICE"                  , "Must be required by a InCallService, to ensure that only the system can bind to it.");
        permissions.put("BIND_INPUT_METHOD"                    , "Must be required by an InputMethodService, to ensure that only the system can bind to it.");
        permissions.put("BIND_MIDI_DEVICE_SERVICE"             , "Must be required by an MidiDeviceService, to ensure that only the system can bind to it.");
        permissions.put("BIND_NFC_SERVICE"                     , "Must be required by a HostApduService or OffHostApduService to ensure that only the system can bind to it.");
        permissions.put("BIND_NOTIFICATION_LISTENER_SERVICE"   , "Must be required by an NotificationListenerService, to ensure that only the system can bind to it.");
        permissions.put("BIND_PRINT_SERVICE"                   , "Must be required by a PrintService, to ensure that only the system can bind to it.");
        permissions.put("BIND_REMOTEVIEWS"                     , "Must be required by a RemoteViewsService, to ensure that only the system can bind to it.");
        permissions.put("BIND_TELECOM_CONNECTION_SERVICE"      , "Must be required by a ConnectionService, to ensure that only the system can bind to it.");
        permissions.put("BIND_TEXT_SERVICE"                    , "Must be required by a TextService (e.g. SpellCheckerService) to ensure that only the system can bind to it.");
        permissions.put("BIND_TV_INPUT"                        , "Must be required by a TvInputService to ensure that only the system can bind to it.");
        permissions.put("BIND_VOICE_INTERACTION"               , "Must be required by a VoiceInteractionService, to ensure that only the system can bind to it.");
        permissions.put("BIND_VPN_SERVICE"                     , "Must be required by a VpnService, to ensure that only the system can bind to it.");
        permissions.put("BIND_WALLPAPER"                       , "Must be required by a WallpaperService, to ensure that only the system can bind to it.");
        permissions.put("BLUETOOTH"                            , "Allows applications to connect to paired bluetooth devices.");
        permissions.put("BLUETOOTH_ADMIN"                      , "Allows applications to discover and pair bluetooth devices.");
        permissions.put("BLUETOOTH_PRIVILEGED"                 , "Allows applications to pair bluetooth devices without user interaction.");
        permissions.put("BODY_SENSORS"                         , "Allows an application to access data from sensors that the user uses to measure what is happening inside his/her body, such as heart rate.");
        permissions.put("BRICK"                                , "Required to be able to disable the device (very dangerous!).");
        permissions.put("BROADCAST_PACKAGE_REMOVED"            , "Allows an application to broadcast a notification that an application package has been removed.");
        permissions.put("BROADCAST_SMS"                        , "Allows an application to broadcast an SMS receipt notification.");
        permissions.put("BROADCAST_STICKY"                     , "Allows an application to broadcast sticky intents.");
        permissions.put("BROADCAST_WAP_PUSH"                   , "Allows an application to broadcast a WAP PUSH receipt notification.");
        permissions.put("CALL_PHONE"                           , "Allows an application to initiate a phone call without going through the Dialer user interface for the user to confirm the call being placed.");
        permissions.put("CALL_PRIVILEGED"                      , "Allows an application to call any phone number, including emergency numbers, without going through the Dialer user interface for the user to confirm the call being placed.");
        permissions.put("CAMERA"                               , "Required to be able to access the camera device.");
        permissions.put("CAPTURE_AUDIO_OUTPUT"                 , "Allows an application to capture audio output.");
        permissions.put("CAPTURE_SECURE_VIDEO_OUTPUT"          , "Allows an application to capture secure video output.");
        permissions.put("CAPTURE_VIDEO_OUTPUT"                 , "Allows an application to capture video output.");
        permissions.put("CHANGE_COMPONENT_ENABLED_STATE"       , "Allows an application to change whether an application component (other than its own) is enabled or not.");
        permissions.put("CHANGE_CONFIGURATION"                 , "Allows an application to modify the current configuration, such as locale.");
        permissions.put("CHANGE_NETWORK_STATE"                 , "Allows applications to change network connectivity state.");
        permissions.put("CHANGE_WIFI_MULTICAST_STATE"          , "Allows applications to enter Wi-Fi Multicast mode.");
        permissions.put("CHANGE_WIFI_STATE"                    , "Allows applications to change Wi-Fi connectivity state.");
        permissions.put("CLEAR_APP_CACHE"                      , "Allows an application to clear the caches of all installed applications on the device.");
        permissions.put("CLEAR_APP_USER_DATA"                  , "Allows an application to clear user data.");
        permissions.put("CONTROL_LOCATION_UPDATES"             , "Allows enabling/disabling location update notifications from the radio.");
        permissions.put("DELETE_CACHE_FILES"                   , "Allows an application to delete cache files.");
        permissions.put("DELETE_PACKAGES"                      , "Allows an application to delete packages.");
        permissions.put("DEVICE_POWER"                         , "Allows low-level access to power management.");
        permissions.put("DIAGNOSTIC"                           , "Allows applications to RW to diagnostic resources.");
        permissions.put("DISABLE_KEYGUARD"                     , "Allows applications to disable the keyguard.");
        permissions.put("DUMP"                                 , "Allows an application to retrieve state dump information from system services.");
        permissions.put("EXPAND_STATUS_BAR"                    , "Allows an application to expand or collapse the status bar.");
        permissions.put("FACTORY_TEST"                         , "Run as a manufacturer test application, running as the root user.");
        permissions.put("FLASHLIGHT"                           , "Allows access to the flashlight.");
        permissions.put("FORCE_BACK"                           , "Allows an application to force a BACK operation on whatever is the top activity.");
        permissions.put("GET_ACCOUNTS"                         , "Allows access to the list of accounts in the Accounts Service.");
        permissions.put("GET_ACCOUNTS_PRIVILEGED"              , "Allows access to the list of accounts in the Accounts Service.");
        permissions.put("GET_PACKAGE_SIZE"                     , "Allows an application to find out the space used by any package.");
        permissions.put("GET_TASKS"                            , "Allows an application to get information about the currently or recently running tasks.");
        permissions.put("GET_TOP_ACTIVITY_INFO"                , "Allows an application to retrieve private information about the current top activity, such as any assist context it can provide.");
        permissions.put("GLOBAL_SEARCH"                        , "This permission can be used on content providers to allow the global search system to access their data.");
        permissions.put("HARDWARE_TEST"                        , "Allows access to hardware peripherals.");
        permissions.put("INJECT_EVENTS"                        , "Allows an application to inject user events (keys, touch, trackball) into the event stream and deliver them to ANY window.");
        permissions.put("INSTALL_LOCATION_PROVIDER"            , "Allows an application to install a location provider into the Location Manager.");
        permissions.put("INSTALL_PACKAGES"                     , "Allows an application to install packages.");
        permissions.put("INSTALL_SHORTCUT"                     , "Allows an application to install a shortcut in Launcher.");
        permissions.put("INTERNAL_SYSTEM_WINDOW"               , "Allows an application to open windows that are for use by parts of the system user interface.");
        permissions.put("INTERNET"                             , "Allows applications to open network sockets.");
        permissions.put("KILL_BACKGROUND_PROCESSES"            , "Allows an application to call killBackgroundProcesses(String).");
        permissions.put("LOCATION_HARDWARE"                    , "Allows an application to use location features in hardware, such as the geofencing api.");
        permissions.put("MANAGE_ACCOUNTS"                      , "Allows an application to manage the list of accounts in the AccountManager.");
        permissions.put("MANAGE_APP_TOKENS"                    , "Allows an application to manage (create, destroy, Z-order) application tokens in the window manager.");
        permissions.put("MANAGE_DOCUMENTS"                     , "Allows an application to manage access to documents, usually as part of a document picker.");
        permissions.put("MASTER_CLEAR"                         , "Not for use by third-party applications.");
        permissions.put("MEDIA_CONTENT_CONTROL"                , "Allows an application to know what content is playing and control its playback.");
        permissions.put("MODIFY_AUDIO_SETTINGS"                , "Allows an application to modify global audio setting.s.");
        permissions.put("MODIFY_PHONE_STATE"                   , "Allows modification of the telephony state - power on, mmi, etc.");
        permissions.put("MOUNT_FORMAT_FILESYSTEMS"             , "Allows formatting file systems for removable storage.");
        permissions.put("MOUNT_UNMOUNT_FILESYSTEMS"            , "Allows mounting and unmounting file systems for removable storage.");
        permissions.put("NFC"                                  , "Allows applications to perform I/O operations over NFC.");
        permissions.put("PACKAGE_USAGE_STATS"                  , "Allows an application to collect component usage statistics.");
        permissions.put("PERSISTENT_ACTIVITY"                  , "This constant was deprecated in API level 9. This functionality will be removed in the future; please do not use. Allow an application to make its activities persistent.");
        permissions.put("PROCESS_OUTGOING_CALLS"               , "Allows an application to monitor, modify, or abort outgoing calls.");
        permissions.put("READ_CALENDAR"                        , "Allows an application to read the user\"s calendar data.");
        permissions.put("READ_CALL_LOG"                        , "Allows an application to read the user\"s call log.");
        permissions.put("READ_CONTACTS"                        , "Allows an application to read the user\"s contacts data.");
        permissions.put("READ_EXTERNAL_STORAGE"                , "Allows an application to read from external storage.");
        permissions.put("READ_FRAME_BUFFER"                    , "Allows an application to take screen shots and more generally get access to the frame buffer data.");
        permissions.put("READ_HISTORY_BOOKMARKS"               , "Allows an application to read (but not write) the user\"s browsing history and bookmarks.");
        permissions.put("READ_INPUT_STATE"                     , "This constant was deprecated in API level 16. The API that used this permission has been removed.");
        permissions.put("READ_LOGS"                            , "Allows an application to read the low-level system log files.");
        permissions.put("READ_PHONE_STATE"                     , "Allows read only access to phone state.");
        permissions.put("READ_PROFILE"                         , "Allows an application to read the user\"s personal profile data.");

        return permissions.get(permission);
    }


    public static void androidManifest(String directory) {
        Pattern p = Pattern.compile("(?i)android:permission=\"android.permission.(.*?)\".*?");
        Scanner sc = null;

        try {
            sc = new Scanner(new File(directory+"/AndroidManifest.xml"), StandardCharsets.UTF_8);

            while (sc.findWithinHorizon(p, 0) != null)
            {
                MatchResult m = sc.match();
                System.out.println(m.group(1));
            }
        }catch (IOException e) {
            System.err.println("[!] "+ e.getMessage());
        }
    }
}
