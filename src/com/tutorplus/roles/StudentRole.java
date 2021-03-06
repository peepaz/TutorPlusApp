package com.tutorplus.roles;

import com.tutorplus.permissions.TutorPlusPermission;
import com.tutorplus.permissions.TutorialMgmtPermission;
import com.tutorplus.permissions.UserMgmtPermission;

import java.util.HashMap;

/**
 * Created by jason on 31/03/2017.
 */
public class StudentRole extends UserRole {

    public StudentRole( ){

        this.rolePermissions = new HashMap<String, TutorPlusPermission>();
        HashMap<String, TutorPlusPermission> permissions = new HashMap<>();


        //Customize permissions for the tutor role
        boolean canCreateUser = false;
        boolean canEditUser = false;
        boolean canDeleteUser = false;
        boolean canEditSelf = true;
        boolean canLogin = true;
        boolean canSuspendUser = false;

        UserMgmtPermission userMgmtPermissions = new UserMgmtPermission(canCreateUser,canEditUser,canDeleteUser,canEditSelf,
                canLogin,canSuspendUser);

        boolean canView = true;
        boolean canStart = true;
        boolean canEnd = true;
        boolean canPublish = false;
        boolean canCreateTutorial = false;
        boolean canDeleteTutorial = false;
        boolean canEditTutorial = false;

        TutorialMgmtPermission tutorialMgmtPermissions = new TutorialMgmtPermission(canCreateTutorial,canEditTutorial,
                canDeleteTutorial,canView,canPublish,canStart,canEnd);


        permissions.put("userMgmtPermissions", userMgmtPermissions);
        permissions.put("tutorialMgmtPermissions", tutorialMgmtPermissions);
        this.rolePermissions = permissions;
        this.userRoleName = "student";

    }

}
