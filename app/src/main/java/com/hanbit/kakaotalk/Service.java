package com.hanbit.kakaotalk;

import java.util.ArrayList;

/**
 * Created by 1027 on 2017-09-29.
 */

public class Service {
    public static interface IPredicate{
        public void execute();
    }
    public static interface IPost{
        public void execute(Object o);
    }
    public static interface ILIst{
        public ArrayList<?> execute(Object o);
    }
    public static interface IGet{
        public Object execute(Object o);
    }
    public static interface IPut{
        public void execute(Object o);
    }
    public static interface IDelete{
        public void execute(Object o);
    }
}
