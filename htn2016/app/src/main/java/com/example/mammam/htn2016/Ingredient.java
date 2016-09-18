package com.example.mammam.htn2016;

import android.os.Parcel;
import android.os.Parcelable;

public class Ingredient implements Parcelable {
    // You can include parcel data types
    //private int mData;
    private String ingName;

    // This is where you write the values you want to save to the `Parcel`.
    // The `Parcel` class has methods defined to help you save all of your values.
    // Note that there are only methods defined for simple values, lists, and other Parcelable objects.
    // You may need to make several classes Parcelable to send the data you want.
    @Override
    public void writeToParcel(Parcel out, int flags) {
        //out.writeInt(mData);
        out.writeString(ingName);
        //out.writeParcelable(mInfo, flags);
    }

    // Using the `in` variable, we can retrieve the values that
    // we originally wrote into the `Parcel`.  This constructor is usually
    // private so that only the `CREATOR` field can access.
    private Ingredient(Parcel in) {
        //mData = in.readInt();
        ingName = in.readString();
        //mInfo = in.readParcelable(MySubParcelable.class.getClassLoader());
    }

    public Ingredient(String ingName) {
        // Normal actions performed by class, since this is still a normal object!
        this.ingName = ingName;
    }

    // In the vast majority of cases you can simply return 0 for this.
    // There are cases where you need to use the constant `CONTENTS_FILE_DESCRIPTOR`
    // But this is out of scope of this tutorial
    @Override
    public int describeContents() {
        return 0;
    }

    // After implementing the `Parcelable` interface, we need to create the
    // `Parcelable.Creator<MyParcelable> CREATOR` constant for our class;
    // Notice how it has our class specified as its type.
    public static final Parcelable.Creator<Ingredient> CREATOR
            = new Parcelable.Creator<Ingredient>() {

        // This simply calls our new constructor (typically private) and
        // passes along the unmarshalled `Parcel`, and then returns the new object!
        @Override
        public Ingredient createFromParcel(Parcel in) {
            return new Ingredient(in);
        }

        // We just need to copy this and change the type to match our class.
        @Override
        public Ingredient[] newArray(int size) {
            return new Ingredient[size];
        }
    };
}

