/* This file was automatically generated by TightDB. */

package com.tightdb.generated;


import com.tightdb.*;
import com.tightdb.lib.*;

/**
 * This class represents a TightDB table and was automatically generated.
 */
public class PeopleTable extends AbstractTable<People, PeopleView, PeopleQuery> {

	public static final EntityTypes<PeopleTable, PeopleView, People, PeopleQuery> TYPES = new EntityTypes<PeopleTable, PeopleView, People, PeopleQuery>(PeopleTable.class, PeopleView.class, People.class, PeopleQuery.class); 

	public final StringRowsetColumn<People, PeopleQuery> name = new StringRowsetColumn<People, PeopleQuery>(TYPES, table, 0, "name");
	public final LongRowsetColumn<People, PeopleQuery> age = new LongRowsetColumn<People, PeopleQuery>(TYPES, table, 1, "age");
	public final BooleanRowsetColumn<People, PeopleQuery> hired = new BooleanRowsetColumn<People, PeopleQuery>(TYPES, table, 2, "hired");

	public PeopleTable() {
		super(TYPES);
	}

	@Override
	protected void specifyStructure(TableSpec spec) {
        registerStringColumn(spec, "name");
        registerLongColumn(spec, "age");
        registerBooleanColumn(spec, "hired");
    }

    public People add(String name, int age, boolean hired) {
        try {
        	long position = size();

        	insertString(0, position, name);
        	insertLong(1, position, age);
        	insertBoolean(2, position, hired);
        	insertDone();

        	return cursor(position);
        } catch (Exception e) {
        	throw addRowException(e);
        }

    }

    public People insert(long position, String name, int age, boolean hired) {
        try {
        	insertString(0, position, name);
        	insertLong(1, position, age);
        	insertBoolean(2, position, hired);
        	insertDone();

        	return cursor(position);
        } catch (Exception e) {
        	throw insertRowException(e);
        }


    }


}
