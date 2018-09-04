package nda.siyad.sargalayam;

import ndk.utils.activities.Login_Base_URL;

public class cgc extends Login_Base_URL {
    @Override
    protected String configure_SELECT_USER_URL() {
        return null;
    }

    @Override
    protected String configure_APPLICATION_NAME() {
        return "ass";
    }

    @Override
    protected Class configure_NEXT_ACTIVITY_CLASS() {
        return null;
    }
}
