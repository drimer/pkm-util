#!/bin/bash

# Run this script from the root folder
sam build --use-container --template-file infra/pkm-stack.json --base-dir . --debug
sam deploy