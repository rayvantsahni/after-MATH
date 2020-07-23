# -*- coding: utf-8 -*-
"""
Created on Thu Jul 23 15:14:33 2020

@author: Rayvant Sahni
"""

from random import randint
from collections import Counter

def roll_dice(*dice, num_trials = 1000000):
    counts = Counter()
    for roll in range(num_trials):
        counts[sum((randint(1, sides)) for sides in dice)] += 1
        
    print("SUM OF\nOUTCOMES\tPROBABILITY")
    for outcome in range(len(dice), sum(dice) + 1):
        print(outcome, "\t\t", round(counts[outcome] * 100 / num_trials, 2), " %", sep = "")
        

roll_dice(4,5,6, num_trials = 1_000)
print()
roll_dice(7,2,6)
