package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,29);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 29;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="Activity.LoadLayout(\"Layout\")";
Debug.ShouldStop(536870912);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Layout")),main.mostCurrent.activityBA);
 BA.debugLineNum = 31;BA.debugLine="File.Copy(File.DirAssets,\"customers-100.csv\", Fil";
Debug.ShouldStop(1073741824);
main.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("customers-100.csv")),(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternalCache")),(Object)(RemoteObject.createImmutable("file1.csv")));
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,39);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 39;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(64);
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,35);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 35;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(4);
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,43);
if (RapidSub.canDelegate("button1_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","button1_click");}
RemoteObject _filepath = RemoteObject.createImmutable("");
RemoteObject _fileds = null;
RemoteObject _lstrs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 43;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 46;BA.debugLine="Dim filepath As String = File.Combine(File.DirInt";
Debug.ShouldStop(8192);
_filepath = main.mostCurrent.__c.getField(false,"File").runMethod(true,"Combine",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternalCache")),(Object)(RemoteObject.createImmutable("file1.csv")));Debug.locals.put("filepath", _filepath);Debug.locals.put("filepath", _filepath);
 BA.debugLineNum = 48;BA.debugLine="Dim fileds() As String = Array As String(\"_id\",\"_";
Debug.ShouldStop(32768);
_fileds = RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.ObjectToString("_id"),BA.ObjectToString("_customerid"),RemoteObject.createImmutable("_firstname")});Debug.locals.put("fileds", _fileds);Debug.locals.put("fileds", _fileds);
 BA.debugLineNum = 49;BA.debugLine="csvparsering.FieldSeparator = \",\"";
Debug.ShouldStop(65536);
main._csvparsering.runVoidMethod ("setFieldSeparator",BA.ObjectToString(","));
 BA.debugLineNum = 50;BA.debugLine="csvparsering.SkipEmptyRows = True";
Debug.ShouldStop(131072);
main._csvparsering.runVoidMethod ("setSkipEmptyRows",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 51;BA.debugLine="csvparsering.ErrorOnDifferentFieldCount = True";
Debug.ShouldStop(262144);
main._csvparsering.runVoidMethod ("setErrorOnDifferentFieldCount",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 52;BA.debugLine="Dim lstrs As List = csvparsering.Parser(filepath,";
Debug.ShouldStop(524288);
_lstrs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstrs = main._csvparsering.runMethod(false,"Parser",(Object)(_filepath),(Object)(_fileds));Debug.locals.put("lstrs", _lstrs);Debug.locals.put("lstrs", _lstrs);
 BA.debugLineNum = 53;BA.debugLine="Log(\"Size=\" & lstrs.Size)";
Debug.ShouldStop(1048576);
main.mostCurrent.__c.runVoidMethod ("LogImpl","0327690",RemoteObject.concat(RemoteObject.createImmutable("Size="),_lstrs.runMethod(true,"getSize")),0);
 BA.debugLineNum = 55;BA.debugLine="For i=0 To lstrs.Size - 1";
Debug.ShouldStop(4194304);
{
final int step8 = 1;
final int limit8 = RemoteObject.solve(new RemoteObject[] {_lstrs.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8) ;_i = ((int)(0 + _i + step8))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 56;BA.debugLine="Dim row As Map = lstrs.Get(i)";
Debug.ShouldStop(8388608);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_row = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstrs.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("row", _row);Debug.locals.put("row", _row);
 BA.debugLineNum = 57;BA.debugLine="Log(row.Get(\"_firstname\"))";
Debug.ShouldStop(16777216);
main.mostCurrent.__c.runVoidMethod ("LogImpl","0327694",BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("_firstname"))))),0);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button2_click() throws Exception{
try {
		Debug.PushSubsStack("Button2_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,61);
if (RapidSub.canDelegate("button2_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","button2_click");}
RemoteObject _filepath = RemoteObject.createImmutable("");
 BA.debugLineNum = 61;BA.debugLine="Private Sub Button2_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 62;BA.debugLine="Dim filepath As String = File.Combine(File.DirInt";
Debug.ShouldStop(536870912);
_filepath = main.mostCurrent.__c.getField(false,"File").runMethod(true,"Combine",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternalCache")),(Object)(RemoteObject.createImmutable("file1.csv")));Debug.locals.put("filepath", _filepath);Debug.locals.put("filepath", _filepath);
 BA.debugLineNum = 63;BA.debugLine="csvparsering.Initialize(\"csvparsering\")";
Debug.ShouldStop(1073741824);
main._csvparsering.runVoidMethod ("Initialize",main.processBA,(Object)(RemoteObject.createImmutable("csvparsering")));
 BA.debugLineNum = 64;BA.debugLine="csvparsering.FieldSeparator = \",\"";
Debug.ShouldStop(-2147483648);
main._csvparsering.runVoidMethod ("setFieldSeparator",BA.ObjectToString(","));
 BA.debugLineNum = 65;BA.debugLine="csvparsering.SkipEmptyRows = True";
Debug.ShouldStop(1);
main._csvparsering.runVoidMethod ("setSkipEmptyRows",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 66;BA.debugLine="csvparsering.ErrorOnDifferentFieldCount = True";
Debug.ShouldStop(2);
main._csvparsering.runVoidMethod ("setErrorOnDifferentFieldCount",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 67;BA.debugLine="csvparsering.Parser2(filepath)";
Debug.ShouldStop(4);
main._csvparsering.runVoidMethod ("Parser2",(Object)(_filepath));
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _csvparsering_parsing(RemoteObject _row) throws Exception{
try {
		Debug.PushSubsStack("csvparsering_Parsing (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,70);
if (RapidSub.canDelegate("csvparsering_parsing")) { return b4a.example.main.remoteMe.runUserSub(false, "main","csvparsering_parsing", _row);}
Debug.locals.put("row", _row);
 BA.debugLineNum = 70;BA.debugLine="Sub csvparsering_Parsing(row As xCSVRecord)";
Debug.ShouldStop(32);
 BA.debugLineNum = 72;BA.debugLine="Log(\"col=\" &  row.getByColumn(0))";
Debug.ShouldStop(128);
main.mostCurrent.__c.runVoidMethod ("LogImpl","01376258",RemoteObject.concat(RemoteObject.createImmutable("col="),_row.runMethod(true,"getByColumn",(Object)(BA.numberCast(int.class, 0)))),0);
 BA.debugLineNum = 73;BA.debugLine="Log(\"col=\" &  row.getByColumn(1))";
Debug.ShouldStop(256);
main.mostCurrent.__c.runVoidMethod ("LogImpl","01376259",RemoteObject.concat(RemoteObject.createImmutable("col="),_row.runMethod(true,"getByColumn",(Object)(BA.numberCast(int.class, 1)))),0);
 BA.debugLineNum = 74;BA.debugLine="Log(\"col=\" &  row.getByColumn(2))";
Debug.ShouldStop(512);
main.mostCurrent.__c.runVoidMethod ("LogImpl","01376260",RemoteObject.concat(RemoteObject.createImmutable("col="),_row.runMethod(true,"getByColumn",(Object)(BA.numberCast(int.class, 2)))),0);
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 26;BA.debugLine="Private Button2 As Button";
main.mostCurrent._button2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
csvrecords.myClass = BA.getDeviceClass ("b4a.example.csvrecords");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 18;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 19;BA.debugLine="Private xui As XUI";
main._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 21;BA.debugLine="Dim csvparsering As xCSVHelper";
main._csvparsering = RemoteObject.createNew ("com.tummosoft.xCSVHelper");
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}