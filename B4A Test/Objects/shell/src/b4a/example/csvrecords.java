
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class csvrecords {
    public static RemoteObject myClass;
	public csvrecords() {
	}
    public static PCBA staticBA = new PCBA(null, csvrecords.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _id = RemoteObject.createImmutable(0);
public static RemoteObject _custid = RemoteObject.createImmutable("");
public static RemoteObject _fname = RemoteObject.createImmutable("");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"custid",_ref.getField(false, "_custid"),"fname",_ref.getField(false, "_fname"),"id",_ref.getField(false, "_id")};
}
}