#!/bin/sh
git pull origin master
now="$(date): add Questions"

git add -A README.md
git add -A _Questions/*
git add -A update-Questions.sh

git commit -m "$now"
git push origin master