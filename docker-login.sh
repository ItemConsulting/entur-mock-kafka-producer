#!/bin/bash



aws ecr get-login-password --region eu-north-1 --profile item | docker login --username AWS --password-stdin 054026012286.dkr.ecr.eu-north-1.amazonaws.com
