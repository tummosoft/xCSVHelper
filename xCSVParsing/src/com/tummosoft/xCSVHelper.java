package com.tummosoft;

import anywheresoftware.b4a.AbsObjectWrapper;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.collections.List;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Field;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@BA.ShortName("xCSVHelper")
@BA.Version(1.01f)
public class xCSVHelper {
    
    static private String _event;
    static private BA _ba;
    
    static private char mFieldSeparator;
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
    
    static  private String mCharset;
    static public void setCharset(String value) {
        mCharset = value;
    }

    static private char mEscape;
    static public void setEscape(String value) {
        mEscape = value.charAt(0);
    }
    static private Reader in;

    static public anywheresoftware.b4a.objects.collections.List Parser(String path, String[] fields) throws IOException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException, ClassNotFoundException {
        anywheresoftware.b4a.objects.collections.List result = new anywheresoftware.b4a.objects.collections.List();
        result.Initialize();
         
        in = new FileReader(path, Charset.forName(mCharset));
        CSVFormat csvFormat = CSVFormat.DEFAULT.builder()                
                .setIgnoreEmptyLines(mSkipEmptyRows)
                .setRecordSeparator(mFieldSeparator)
                .setSkipHeaderRecord(mSkipHeaderRecord)                
                .build(); 
        
        Iterable<CSVRecord> records = csvFormat.parse(in);
                
        int index = 0;
        for (CSVRecord record : records) {                       
            Map<Object,Object> mp = new HashMap();             
            for (int i=0; i < fields.length; i++) {                 
                mp.put(fields[i], record.get(i));                
            } 
            result.Add(mp);
           
        }
        return result;
    }    
}
// Nguyen hoi huong phuoc duc nay den tat ca Chu Thien cu ngu tai Chua Nam Tong, Binh Tan; Chua Bo De Dao Trang tai An Do;
// Kinh mong cac ngai giup cho con vuot qua chuong nan bua chu cua dong ho 3 doi ba 6 Chia, Ut Vuon Co, 7 Liem, 3 Mung, 4 Lam;