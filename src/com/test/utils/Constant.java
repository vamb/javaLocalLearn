package com.test.utils;

import java.io.File;

public interface Constant {
    String SEPARATOR = File.separator;
    String WIN_FILE_PATH  = "D:"+ Constant.SEPARATOR+"workspace"+Constant.SEPARATOR+"javaLocalLearn"+Constant.SEPARATOR+
            "src"+Constant.SEPARATOR+"resource"+Constant.SEPARATOR+"file";
    String ROOT_FILE_PATH = Constant.SEPARATOR;
}
