package org.acra.collector;

import android.content.Context;
import gnu.expr.LambdaExp;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import org.acra.util.BoundedLinkedList;

class LogFileCollector {
    private LogFileCollector() {
    }

    public static String collectLogFile(Context context, String fileName, int numberOfLines) throws IOException {
        BufferedReader reader;
        BoundedLinkedList<String> resultBuffer = new BoundedLinkedList(numberOfLines);
        if (fileName.contains("/")) {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)), LambdaExp.SEQUENCE_RESULT);
        } else {
            reader = new BufferedReader(new InputStreamReader(context.openFileInput(fileName)), LambdaExp.SEQUENCE_RESULT);
        }
        for (String line = reader.readLine(); line != null; line = reader.readLine()) {
            resultBuffer.add(line + "\n");
        }
        return resultBuffer.toString();
    }
}
