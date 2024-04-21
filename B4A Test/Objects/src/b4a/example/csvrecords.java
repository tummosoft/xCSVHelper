package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class csvrecords extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.csvrecords");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.csvrecords.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public int _id = 0;
public String _custid = "";
public String _fname = "";
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public String  _class_globals(b4a.example.csvrecords __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="csvrecords";
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="Private id As Int";
_id = 0;
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="Private custid As String";
_custid = "";
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="Private fname As String";
_fname = "";
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.csvrecords __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="csvrecords";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="End Sub";
return "";
}
public String  _setcustomerid(b4a.example.csvrecords __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="csvrecords";
if (Debug.shouldDelegate(ba, "setcustomerid", false))
	 {return ((String) Debug.delegate(ba, "setcustomerid", new Object[] {_value}));}
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Public Sub setcustomerid(value As String)";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="custid = value";
__ref._custid /*String*/  = _value;
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="End Sub";
return "";
}
public String  _setfirstname(b4a.example.csvrecords __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="csvrecords";
if (Debug.shouldDelegate(ba, "setfirstname", false))
	 {return ((String) Debug.delegate(ba, "setfirstname", new Object[] {_value}));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Public Sub setfirstname(value As String)";
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="Log(value.Length)";
__c.LogImpl("01114114",BA.NumberToString(_value.length()),0);
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="If (value.Length > 0) Then";
if ((_value.length()>0)) { 
 };
RDebugUtils.currentLine=1114118;
 //BA.debugLineNum = 1114118;BA.debugLine="End Sub";
return "";
}
public String  _setid(b4a.example.csvrecords __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="csvrecords";
if (Debug.shouldDelegate(ba, "setid", false))
	 {return ((String) Debug.delegate(ba, "setid", new Object[] {_value}));}
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Public Sub setid(value As Int)";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="id = value";
__ref._id /*int*/  = _value;
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="End Sub";
return "";
}
}