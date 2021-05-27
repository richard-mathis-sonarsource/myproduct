package com.mathiric.myproduct;

import java.lang.String;        // Noncompliant; java.lang classes are always implicitly imported
import com.mathiric.myproduct.Car;    // Noncompliant; same-package files are always implicitly imported
import java.io.File;            // Noncompliant; File is not used

import com.mathiric.common.Color;
import com.mathiric.common.Color;    // Noncompliant; 'SomeType' is already imported

public class Rspec1128 {

    public String someString;
    public Color something;

}