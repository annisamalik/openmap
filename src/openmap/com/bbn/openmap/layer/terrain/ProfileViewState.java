// **********************************************************************
// 
// <copyright>
// 
//  BBN Technologies, a Verizon Company
//  10 Moulton Street
//  Cambridge, MA 02138
//  (617) 873-8000
// 
//  Copyright (C) BBNT Solutions LLC. All rights reserved.
// 
// </copyright>
// **********************************************************************
// 
// $Source: /cvs/distapps/openmap/src/openmap/com/bbn/openmap/layer/terrain/ProfileViewState.java,v $
// $RCSfile: ProfileViewState.java,v $
// $Revision: 1.1.1.1 $
// $Date: 2003/02/14 21:35:48 $
// $Author: dietrick $
// 
// **********************************************************************


package com.bbn.openmap.layer.terrain;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import com.bbn.openmap.layer.util.stateMachine.*;

class ProfileViewState extends State{

    protected ProfileGenerator profileTool;

    public ProfileViewState(ProfileGenerator tool){
	profileTool = tool;
    }

    public void actionPerformed(ActionEvent e){
	String ac = e.getActionCommand();
	if (ac.equalsIgnoreCase(TerrainLayer.clearCommand)){
	    profileTool.reset();
	}
    }
}








