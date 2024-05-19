import os
import sys
from antlr4 import *

def run_antlr_tool():
    os.system('java -jar C:\\Users\\jangu\\Downloads\\antlr-4.13.1-complete.jar -Dlanguage=Python3 PGN.g4')

if __name__ == "__main__":
    run_antlr_tool()