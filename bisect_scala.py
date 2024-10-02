import shutil
import subprocess
import sys
import os
args = sys.argv

oracle = args[1]
error = args[2]


compiler_versions = ["3.4.2", "3.4.1", "3.3.3",
                     "3.2.2", "3.1.3", "3.0.2", "3.0.0", "2.13.14"]
current_folder = "out/Programs/" + oracle + "/scalac/" + error
if error == "inexhaustive":
    current_folder += "/false_positive"


temp = current_folder+"/temp_folder"
for file in os.listdir(current_folder):
    if not file.endswith(".scala"):
        continue
    file = current_folder+"/"+file
    lowest_version = "3.4.2"
    for version in compiler_versions:
        if os.path.isdir(temp):
            shutil.rmtree(temp)
        os.mkdir(temp)

        shutil.copyfile(file, temp+"/testprog.scala")

        f = open(temp+"/out.txt", "w")
        subprocess.run([" ~/.sdkman/candidates/scala/current/bin", "use", "scala", version],
                       shell=False, stdout=f, check=False)
        subprocess.run(["scala", "testprog.scala"], cwd=temp,
                       shell=False, stdout=f, check=False)
        if error == "unreachable" and f.read().find("unreachable") == 0 or error == "inexhaustive" and f.read().find("inexhaustive") > 0:
            break
        os.remove(f)
        lowest_version = version

    new_folder = current_folder+"/"+lowest_version
    if not os.path.isdir(new_folder):
        os.mkdir(new_folder)

    shutil.rename(file, new_folder+"/"+file)
