/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE789_Uncontrolled_Mem_Alloc__database_ArrayList_54b.java
Label Definition File: CWE789_Uncontrolled_Mem_Alloc.int.label.xml
Template File: sources-sink-54b.tmpl.java
*/
/*
 * @description
 * CWE: 789 Uncontrolled Memory Allocation
 * BadSource: database Read data from a database
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: ArrayList
 *    BadSink : Create an ArrayList using data as the initial size
 * Flow Variant: 54 Data flow: data passed as an argument from one method through three others to a fifth; all five functions are in different classes in the same package
 *
 * */

package testcases.CWE789_Uncontrolled_Mem_Alloc.s01;
import testcasesupport.*;

import javax.servlet.http.*;

public class CWE789_Uncontrolled_Mem_Alloc__database_ArrayList_54b
{
    public void badSink(int data ) throws Throwable
    {
        (new CWE789_Uncontrolled_Mem_Alloc__database_ArrayList_54c()).badSink(data );
    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(int data ) throws Throwable
    {
        (new CWE789_Uncontrolled_Mem_Alloc__database_ArrayList_54c()).goodG2BSink(data );
    }
}
