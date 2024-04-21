package com.tummosoft;

import anywheresoftware.b4a.AbsObjectWrapper;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BA.Events;
import anywheresoftware.b4a.objects.collections.List;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

@BA.ShortName("xCSVHelper")
@BA.Version(1.22f)
@Events(values={"Parsing(row as xCSVRecord)"})
public class xCSVHelper {

    static private String _event;
    static private BA _ba;

    static private char mFieldSeparator;
    
    public void Initialize (final BA ba, String EventName) throws IOException {
        _ba = ba;
        _event = EventName.toLowerCase();
    }
    
    static public void setFieldSeparator(String value) {
        mFieldSeparator = value.charAt(0);
    }

    static private boolean mSkipEmptyRows = false;

    static public void setSkipEmptyRows(boolean value) {
        mSkipEmptyRows = value;
    }

    static private boolean mErrorOnDifferentFieldCount;

    static public void setErrorOnDifferentFieldCount(boolean value) {
        mErrorOnDifferentFieldCount = value;
    }

    static private boolean mSkipHeaderRecord;

    static public void setSkipHeaderRecord(boolean value) {
        mSkipHeaderRecord = value;
    }

    static private String mCharset = null;

    static public void setCharset(String value) {
        mCharset = value;
    }

    static private char mEscape;

    static public void setEscape(String value) {
        mEscape = value.charAt(0);
    }
    
    private static boolean mAllowMissingColumnNames = false;
    static public void setAllowMissingColumnNames(boolean value) {
        mAllowMissingColumnNames = value;
    }
    
    private static char mQuote;
     static public void setQuote(String value) {
        mQuote = value.charAt(mQuote);
    }
    
    
    static private Reader in;
    private  int index = -1;
    
    public void Parser2(String path) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException {        
          try {
            if (mCharset != null) {
                in = new FileReader(path, Charset.forName(mCharset));
            } else {
                in = new FileReader(path);
            }
            new Thread(() -> {
            CSVFormat csvFormat = CSVFormat.DEFAULT.builder()
                    .setIgnoreEmptyLines(mSkipEmptyRows)
                    .setRecordSeparator(mFieldSeparator)
                    .setAllowMissingColumnNames(mAllowMissingColumnNames)
                    .setQuote(mQuote)
                    .setSkipHeaderRecord(mSkipHeaderRecord)
                    .build();
            
                try {
                    Iterable<CSVRecord> records = csvFormat.parse(in);
                    for (CSVRecord record : records) {  
                        //Object[] row = record.toList().toArray();
                        xCSVRecord field = new xCSVRecord();
                        field.setObject(record);
                        if (field != null) {
                            _ba.raiseEvent(this, _event + "_parsing", field);                                
                        }
                    }                    
                } catch (Exception e) {
                     BA.LogError(e.getMessage());
                }
            }).start();

        } catch (IOException ex) {
            BA.LogError(ex.getMessage());
        }
      
    }

    public anywheresoftware.b4a.objects.collections.List Parser(String path, String[] fields) {
        anywheresoftware.b4a.objects.collections.List result = new anywheresoftware.b4a.objects.collections.List();
        result.Initialize();
        try {
            if (mCharset != null) {
                in = new FileReader(path, Charset.forName(mCharset));
            } else {
                in = new FileReader(path);
            }
           
            
                try {
                    CSVFormat csvFormat = CSVFormat.DEFAULT.builder()
                            .setIgnoreEmptyLines(mSkipEmptyRows)
                            .setRecordSeparator(mFieldSeparator)
                            .setQuote(mQuote)
                            .setAllowMissingColumnNames(mAllowMissingColumnNames)
                            .setSkipHeaderRecord(mSkipHeaderRecord)
                            .build();
                    
                    Iterable<CSVRecord> records = csvFormat.parse(in);
                    
                    int index = 0;
                    for (CSVRecord record : records) {
                        Map<Object, Object> mp = new HashMap();
                        for (int i = 0; i < fields.length; i++) {
                            mp.put(fields[i], record.get(i));
                        }
                        result.Add(mp);
                        
                    }   } catch (IOException ex) {
                    Logger.getLogger(xCSVHelper.class.getName()).log(Level.SEVERE, null, ex);
                }
            
        } catch (IOException ex) {
            Logger.getLogger(xCSVHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        return result;
    }

    @BA.ShortName("xCSVRecord")
    public static class xCSVRecord extends AbsObjectWrapper<CSVRecord> {

        public String getByName(String name) {
            return getObject().get(name);
        }

        public String getByColumn(int column) {
            return getObject().get(column);
        }

        public String getComment() {
            return getObject().getComment();
        }

        public long getRecordNumber() {
            return getObject().getRecordNumber();
        }

    }
}
// Nguyen hoi huong phuoc duc nay den tat ca Chu Thien cu ngu tai Chua Nam Tong, Binh Tan; Chua Bo De Dao Trang tai An Do, Linh Thuu Son; 
// Nguyen xin cac vi hoa giai ta thuat cua bon ta vai, bat nhan, bat hieu, bat nghia, bat tin: NGUYEN VIET XO, UT, KHOA, QUANG, ANH RE CUA NO, 6 NGHIA va bat ky nguoi nao chung thue muon;
// Ngoan, con Vang, Ut Vuon Co, Hai, Nhanh, Tho, Khuyen, Vinh, Vui, 6 Chia, Ut Tron, 6 Kheo, Dang
// Nguyen cho pha vo moi lien ket giua Nguyen Viet Xo, Tran Quang Vinh, Ut Vuon Co;
// Nguyen cho moi toi ac cua gia dinh 6 Nghia bi lo dien, bi phoi bay;
// Nguyen xin cac vi hoa giai ta thuat cua Tran Van Ngoan, Ut Tron, Tran Quang Vinh, 6 Chia, Ut Vuon Co, 3 Mung (Nam), 3 Nhang
