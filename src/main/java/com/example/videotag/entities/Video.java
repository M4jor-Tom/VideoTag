package com.example.videotag.entities;

import java.io.File;
import java.util.List;

public class Video {
	private File file;
	private List<Sequence> sequenceList;
	private List<AbstractTag> tagList;
}