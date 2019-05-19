# House-Creation

## Overview
I wrote this to randomly generate the student lists for a House system for our school, similar to the houses in Harry Potter or the [Tribes Learning Community](https://tribes.com/) student management system. Any student names or IDs are fictional and only used for testing.

## First Version
The first version of this project added students from a text file to a master ArrayList, then randomly added them to one of four house specific ArrayLists, which I printed to console and copied into a new text file. Once I started working with files in other projects, using the File, Scanner, and FileReader objects, I began incorporating that into this project.

## Current Version
I've been working on reading from and outputting to a CSV file instead. This is my first foray in working with CSV files and using FileWriter, so bear with me. If you have any suggestions to make this code better, I'm open to constructive criticism!

## TO-DO
Though I don't use the ArrayList method anymore, I'd like to change it to be a Set to prevent the possibility of duplicates. The dataset I'm using (our district's student management system) shouldn't ever have duplicates, but I'd like to code for it just in case multiple queries lead to some overlap or something. I'd like to implement the same thing for reading the CSV files as well, though again, there's no reason the dataset should have duplicates.
