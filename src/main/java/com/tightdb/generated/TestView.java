/* This file was automatically generated by TightDB. */

package com.tightdb.generated;


import com.tightdb.*;
import com.tightdb.lib.*;

/**
 * This class represents a TightDB view and was automatically generated.
 */
public class TestView extends AbstractView<Test, TestView, TestQuery> {

	public final LongRowsetColumn<Test, TestQuery> first = new LongRowsetColumn<Test, TestQuery>(TestTable.TYPES, rowset, 0, "first");
	public final StringRowsetColumn<Test, TestQuery> second = new StringRowsetColumn<Test, TestQuery>(TestTable.TYPES, rowset, 1, "second");
	public final LongRowsetColumn<Test, TestQuery> third = new LongRowsetColumn<Test, TestQuery>(TestTable.TYPES, rowset, 2, "third");
	public final LongRowsetColumn<Test, TestQuery> fourth = new LongRowsetColumn<Test, TestQuery>(TestTable.TYPES, rowset, 3, "fourth");

	public TestView(TableViewBase viewBase) {
		super(TestTable.TYPES, viewBase);
	}

}