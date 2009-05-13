__author__="Sergey Karakovskiy, sergey at idsia dot ch"
__date__ ="$Apr 30, 2009 1:46:32 AM$"

import sys
from AI.environments.MarioEnvironment import MarioEnvironment
from AI.experiments.EpisodicExperiment import EpisodicExperiment
from AI.tasks.MarioTask import MarioTask
from Utils.CmdLineOptions import CmdLineOptions

def main():
    clo = CmdLineOptions(sys.argv)
    task = MarioTask(MarioEnvironment(clo.getHost(), clo.getPort(), clo.getAgent().name))
    exp = EpisodicExperiment(clo.getAgent(), task)
    exp.doEpisodes(3)

if __name__ == "__main__":
    main()
else:
    print "This is module to be run rather than imported."

