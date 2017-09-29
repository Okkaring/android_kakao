package com.hanbit.kakaotalk;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MemberAdd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.member_add);
        final Context context = MemberAdd.this;
        findViewById(R.id.addConfirmBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "친구추가할거임!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(context,MemberList.class));
            }
        });
        findViewById(R.id.addCancleBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "친추취소할거임!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(context,MemberList.class));
            }
        });
    }
}
