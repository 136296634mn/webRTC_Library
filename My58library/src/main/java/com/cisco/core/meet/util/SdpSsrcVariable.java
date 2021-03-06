package com.cisco.core.meet.util;

import org.webrtc.IceCandidate;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class SdpSsrcVariable {

	  public static String ice_cd1="";//获取ssrc
	  public static String ice_cd2="";
	  public static List<IceCandidate> ice_candidate=new ArrayList<IceCandidate>();
	  public static String[] mediaLines;
	  
	  public static boolean audiomuted=false;
	  public static boolean videomuted=false;
	  public static int googAvailableReceiveBandwidth=0;
	  public static int googAvailableSendBandwidth=0;
	  public static String packetLoss_download="0";
	  public static String packetLoss_upload="0";
	  
	  
	  /* 
	    * 获取uuid
	    */    
	   public static String getUUID(){    
	       String uuid = UUID.randomUUID().toString();    
	       return uuid;    
	   } 
}
