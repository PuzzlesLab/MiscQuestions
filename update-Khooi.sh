#!/bin/sh
git pull origin master
now="$(date): update all by khooi"

git add -A README.md
git add -A *
git add -A update-Khooi.sh

git commit -m "$now"
git push origin master