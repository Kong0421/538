<LinearLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_weight="2"
    android:gravity="center"
    android:orientation="vertical">

    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/yhdl"
        android:textColor="#ff0000"
        android:textSize="50dp" />
</LinearLayout>
<LinearLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="horizontal">
    <LinearLayout
        android:layout_width="130dp"
        android:layout_height="match_parent"
        android:orientation="vertical"
        >
        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:gravity="right"
            android:textSize="25dp"
            android:text="@string/yhm"
            android:paddingTop="15dp"
            />
        <EditText
            android:layout_width="match_parent"
            android:layout_height="20dp" />
        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:gravity="right"
            android:textSize="25dp"
            android:text="@string/mima"
            android:paddingTop="15dp"
            />
    </LinearLayout>
<LinearLayout
    android:layout_width="match_parent"
    android:layout_height="107dp"
    android:orientation="vertical"
    android:gravity="left">

<EditText
    android:id="@+id/editText7"
    android:layout_width="200dp"
    android:layout_height="5dp"
    android:layout_weight="1"
    android:ems="10"
    android:hint="@string/text"
    android:background="#ffffff"
    android:inputType="textPersonName" />
    <EditText
        android:layout_width="match_parent"
        android:layout_height="20dp" />
    <EditText
        android:id="@+id/editText8"
        android:layout_width="200dp"
        android:layout_height="5dp"
        android:layout_weight="1"
        android:ems="10"
        android:hint="@string/password"
        android:background="#ffffff"
        android:inputType="textPassword"
        />
</LinearLayout>
</LinearLayout>
<LinearLayout
    android:layout_width="match_parent"
    android:layout_height="20dp">

</LinearLayout>

<LinearLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_weight="3"
    android:orientation="horizontal">



    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="match_parent"
        android:layout_weight="2"

        android:gravity="center"
        android:orientation="horizontal">

        <Button
            android:id="@+id/button11"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_gravity="top"

            android:text="登录"
            android:textSize="30dp"/>
        <TextView
            android:layout_width="20dp"
            android:layout_height="match_parent"

            />

        <Button
            android:id="@+id/button12"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_gravity="top"
            android:text="取消"
            android:textSize="30dp"/>
    </LinearLayout>


</LinearLayout>
