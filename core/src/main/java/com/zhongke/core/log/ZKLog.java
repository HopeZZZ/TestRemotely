package com.zhongke.core.log;

import com.elvishew.xlog.LogConfiguration;
import com.elvishew.xlog.LogLevel;
import com.elvishew.xlog.XLog;
import com.elvishew.xlog.formatter.message.object.ObjectFormatter;
import com.zhongke.core.constant.GlobalConstant;

public class ZKLog {


    /**
     * Initialize log system, should be called only once.
     *
     * @since 1.3.0
     */
    public static void init() {
        XLog.init();
    }

    public static void v(Object object) {
        if (GlobalConstant.isRelease){
            return;
        }
        XLog.v(object);
    }

    /**
     * Log an array with level {@link LogLevel#VERBOSE}.
     *
     * @param array the array to log
     */
    public static void v(Object[] array) {
        if (GlobalConstant.isRelease){
            return;
        }
        XLog.v(array);
    }

    /**
     * Log a message with level {@link LogLevel#VERBOSE}.
     *
     * @param format the format of the message to log
     * @param args   the arguments of the message to log
     */
    public static void v(String format, Object... args) {
        if (GlobalConstant.isRelease){
            return;
        }
        XLog.v(format, args);
    }

    /**
     * Log a message with level {@link LogLevel#VERBOSE}.
     *
     * @param msg the message to log
     */
    public static void v(String msg) {
        if (GlobalConstant.isRelease){
            return;
        }
        XLog.v(msg);
    }

    /**
     * Log a message and a throwable with level {@link LogLevel#VERBOSE}.
     *
     * @param msg the message to log
     * @param tr  the throwable to be log
     */
    public static void v(String msg, Throwable tr) {
        if (GlobalConstant.isRelease){
            return;
        }
        XLog.v(msg, tr);
    }

    /**
     * Log an object with level {@link LogLevel#DEBUG}.
     *
     * @param object the object to log
     * @see LogConfiguration.Builder#addObjectFormatter(Class, ObjectFormatter)
     * @since 1.1.0
     */
    public static void d(Object object) {
        if (GlobalConstant.isRelease){
            return;
        }
        XLog.d(object);
    }

    /**
     * Log an array with level {@link LogLevel#DEBUG}.
     *
     * @param array the array to log
     */
    public static void d(Object[] array) {
        if (GlobalConstant.isRelease){
            return;
        }
        XLog.d(array);
    }

    /**
     * Log a message with level {@link LogLevel#DEBUG}.
     *
     * @param format the format of the message to log
     * @param args   the arguments of the message to log
     */
    public static void d(String format, Object... args) {
        if (GlobalConstant.isRelease){
            return;
        }
        XLog.d(format, args);
    }

    /**
     * Log a message with level {@link LogLevel#DEBUG}.
     *
     * @param msg the message to log
     */
    public static void d(String msg) {
        if (GlobalConstant.isRelease){
            return;
        }
        XLog.d(msg);
    }

    /**
     * Log a message and a throwable with level {@link LogLevel#DEBUG}.
     *
     * @param msg the message to log
     * @param tr  the throwable to be log
     */
    public static void d(String msg, Throwable tr) {
        if (GlobalConstant.isRelease){
            return;
        }
        XLog.d(msg, tr);
    }

    /**
     * Log an object with level {@link LogLevel#INFO}.
     *
     * @param object the object to log
     * @see LogConfiguration.Builder#addObjectFormatter(Class, ObjectFormatter)
     * @since 1.1.0
     */
    public static void i(Object object) {
        if (GlobalConstant.isRelease){
            return;
        }
        XLog.i(object);
    }

    /**
     * Log an array with level {@link LogLevel#INFO}.
     *
     * @param array the array to log
     */
    public static void i(Object[] array) {
        if (GlobalConstant.isRelease){
            return;
        }
        XLog.i(array);
    }

    /**
     * Log a message with level {@link LogLevel#INFO}.
     *
     * @param format the format of the message to log
     * @param args   the arguments of the message to log
     */
    public static void i(String format, Object... args) {
        if (GlobalConstant.isRelease){
            return;
        }
        XLog.i(format, args);
    }

    /**
     * Log a message with level {@link LogLevel#INFO}.
     *
     * @param msg the message to log
     */
    public static void i(String msg) {
        if (GlobalConstant.isRelease){
            return;
        }
        XLog.i(msg);
    }

    /**
     * Log a message and a throwable with level {@link LogLevel#INFO}.
     *
     * @param msg the message to log
     * @param tr  the throwable to be log
     */
    public static void i(String msg, Throwable tr) {
        if (GlobalConstant.isRelease){
            return;
        }
        XLog.i(msg, tr);
    }

    /**
     * Log an object with level {@link LogLevel#WARN}.
     *
     * @param object the object to log
     * @see LogConfiguration.Builder#addObjectFormatter(Class, ObjectFormatter)
     * @since 1.1.0
     */
    public static void w(Object object) {
        if (GlobalConstant.isRelease){
            return;
        }
        XLog.w(object);
    }

    /**
     * Log an array with level {@link LogLevel#WARN}.
     *
     * @param array the array to log
     */
    public static void w(Object[] array) {
        if (GlobalConstant.isRelease){
            return;
        }
        XLog.w(array);
    }

    /**
     * Log a message with level {@link LogLevel#WARN}.
     *
     * @param format the format of the message to log
     * @param args   the arguments of the message to log
     */
    public static void w(String format, Object... args) {
        if (GlobalConstant.isRelease){
            return;
        }
        XLog.w(format, args);
    }

    /**
     * Log a message with level {@link LogLevel#WARN}.
     *
     * @param msg the message to log
     */
    public static void w(String msg) {
        if (GlobalConstant.isRelease){
            return;
        }
        XLog.w(msg);
    }

    /**
     * Log a message and a throwable with level {@link LogLevel#WARN}.
     *
     * @param msg the message to log
     * @param tr  the throwable to be log
     */
    public static void w(String msg, Throwable tr) {
        if (GlobalConstant.isRelease){
            return;
        }
        XLog.w(msg, tr);
    }

    /**
     * Log an object with level {@link LogLevel#ERROR}.
     *
     * @param object the object to log
     * @see LogConfiguration.Builder#addObjectFormatter(Class, ObjectFormatter)
     * @since 1.1.0
     */
    public static void e(Object object) {
        if (GlobalConstant.isRelease){
            return;
        }
        XLog.e(object);
    }

    /**
     * Log an array with level {@link LogLevel#ERROR}.
     *
     * @param array the array to log
     */
    public static void e(Object[] array) {
        if (GlobalConstant.isRelease){
            return;
        }
        XLog.e(array);
    }

    /**
     * Log a message with level {@link LogLevel#ERROR}.
     *
     * @param format the format of the message to log
     * @param args   the arguments of the message to log
     */
    public static void e(String format, Object... args) {
        if (GlobalConstant.isRelease){
            return;
        }
        XLog.e(format, args);
    }

    /**
     * Log a message with level {@link LogLevel#ERROR}.
     *
     * @param msg the message to log
     */
    public static void e(String msg) {
        if (GlobalConstant.isRelease){
            return;
        }
        XLog.e(msg);
    }

    /**
     * Log a message and a throwable with level {@link LogLevel#ERROR}.
     *
     * @param msg the message to log
     * @param tr  the throwable to be log
     */
    public static void e(String msg, Throwable tr) {
        if (GlobalConstant.isRelease){
            return;
        }
        XLog.e(msg, tr);
    }

    /**
     * Log a JSON string, with level {@link LogLevel#DEBUG} by default.
     *
     * @param json the JSON string to log
     */
    public static void json(String json) {if (GlobalConstant.isRelease){
        return;
    }
        XLog.json(json);
    }

    /**
     * Log a XML string, with level {@link LogLevel#DEBUG} by default.
     *
     * @param xml the XML string to log
     */
    public static void xml(String xml) {
        if (GlobalConstant.isRelease) {
            return;
        }
        XLog.xml(xml);
    }
}
