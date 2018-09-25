#!/usr/bin/python
"""
Eclipse.py by Bruce Eckel, for Thinking in Java 4e
Modify or insert package statments so that Eclipse is happy with the code tree.
Run this with no arguments from the root of the code tree.

The Ant build will not work once you run this program!

You may also want to modify the dotproject and dotclasspath text below.

You must have Python 2.3 installed to run this program. See www.python.org.
"""
import os


for path, dirs, files in os.walk('.'):
    for file in files:
        if file.endswith(".java"):
            filepath = path + os.sep + file
            firstLine = open(filepath).readline().strip()
            tagPath = firstLine.split()[1]
            tagPath = ".".join(tagPath.split('/')[:-1])
            packageStatement = "package " + tagPath + ";"
            code = open(filepath).readlines()
            found = False
            for line in code:
                if line.startswith("package "):
                    found = True
            if not found:
                code.insert(1, packageStatement + " /* Added by Eclipse.py */\n")
                open(filepath, 'w').writelines(code)

print """Package declarations added.
Use DEclipse.py if you want to go back to building with Ant."""
       