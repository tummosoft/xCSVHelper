package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class csvrecords_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private id As Int";
csvrecords._id = RemoteObject.createImmutable(0);__ref.setField("_id",csvrecords._id);
 //BA.debugLineNum = 3;BA.debugLine="Private custid As String";
csvrecords._custid = RemoteObject.createImmutable("");__ref.setField("_custid",csvrecords._custid);
 //BA.debugLineNum = 4;BA.debugLine="Private fname As String";
csvrecords._fname = RemoteObject.createImmutable("");__ref.setField("_fname",csvrecords._fname);
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (csvrecords) ","csvrecords",2,__ref.getField(false, "ba"),__ref,8);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "csvrecords","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(128);
 BA.debugLineNum = 10;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcustomerid(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("setcustomerid (csvrecords) ","csvrecords",2,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("setcustomerid")) { return __ref.runUserSub(false, "csvrecords","setcustomerid", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 16;BA.debugLine="Public Sub setcustomerid(value As String)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 17;BA.debugLine="custid = value";
Debug.ShouldStop(65536);
__ref.setField ("_custid" /*RemoteObject*/ ,_value);
 BA.debugLineNum = 18;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfirstname(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("setfirstname (csvrecords) ","csvrecords",2,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("setfirstname")) { return __ref.runUserSub(false, "csvrecords","setfirstname", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 20;BA.debugLine="Public Sub setfirstname(value As String)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 22;BA.debugLine="Log(value.Length)";
Debug.ShouldStop(2097152);
csvrecords.__c.runVoidMethod ("LogImpl","01114114",BA.NumberToString(_value.runMethod(true,"length")),0);
 BA.debugLineNum = 23;BA.debugLine="If (value.Length > 0) Then";
Debug.ShouldStop(4194304);
if ((RemoteObject.solveBoolean(">",_value.runMethod(true,"length"),BA.numberCast(double.class, 0)))) { 
 };
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setid(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("setid (csvrecords) ","csvrecords",2,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("setid")) { return __ref.runUserSub(false, "csvrecords","setid", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 12;BA.debugLine="Public Sub setid(value As Int)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 13;BA.debugLine="id = value";
Debug.ShouldStop(4096);
__ref.setField ("_id" /*RemoteObject*/ ,_value);
 BA.debugLineNum = 14;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}