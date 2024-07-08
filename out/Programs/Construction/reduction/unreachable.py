import sys
import re
import os
import subprocess
import shutil

#!/usr/bin/env python

err_file = open("temp.txt")

err_dirty = err_file.read()
unreach_count = err_dirty.count("Match case Unreachable Warning:")
if unreach_count == 0:  # no more unreachable cases
    sys.exit(1)
err_count = err_dirty.count("error")
if err_count > 0:  # incorrect program
    sys.exit(1)
warn_pattern = re.compile(r"[0-9]*(?= warning(s?) found)")
match = warn_pattern.search(err_dirty)
if not match or int(match.group()) != unreach_count:  # There are other new warnings
    sys.exit(1)  # currently exit, maybe allow some other warnings in the future

# remove espace characters etc that would color the output
err = re.sub(r"\x1B\[|33m|31m|0m", "", err_dirty)
case_pattern = re.compile(
    r"(?<=case)[ A-z | _ | ( | , | ) | ' | \d ]*(?= => )")
case_match = case_pattern.search(err)
if not case_match:
    sys.exit(1)
case_string = case_match.group()

match_var = re.sub(r"_(?=[,|\)])", "n", case_string)
# get the returned integer at that line
case_number_pattern = re.compile(r"(?<= =>) \d")
case_number_match = case_number_pattern.search(err)
if not case_number_pattern:
    sys.exit(1)
case_number = int(case_number_match.group())
if os.path.isdir("temp_folder"):
    shutil.rmtree("temp_folder")
os.mkdir("temp_folder")
test_file = open("temp_folder/testprog.scala", "x")
cur_file = open("tempprog.scala")

inserted = False
test_file.write("@main def main() = {\n")
for num, line in enumerate(cur_file.readlines()[1:]):
    if "val v_a" in line:
        n = "val n:Null & AnyVal = null.asInstanceOf[Null&AnyVal]\n"
        test_file.write(n)
        val_a = line.replace("null", match_var)
        test_file.write(val_a)
    elif "}" in line and not inserted:
        test_file.write(line)
        test_file.write("  print(v_b)\n")
        inserted = True
    else:
        test_file.write(line)
test_file.flush()

command = "scala"
f = open("temp_folder/temp_num.txt", "x")
p = subprocess.run(["scala", "testprog.scala"], cwd="temp_folder",
                   shell=False, stdout=f, check=False)
num = open("temp_folder/temp_num.txt", "r").read()
if int(num) == case_number:
    sys.exit(0)
else:
    sys.exit(1)
