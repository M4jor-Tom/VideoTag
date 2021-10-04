package com.example.videotag.domain;

public class VideoTagLabelizedDomainClass extends VideoTagDomainClass {
		private String label;

		public VideoTagLabelizedDomainClass(String label) {
			super();

			setLabel(label);
		}

		public String getLabel() {
			return label;
		}

		private void setLabel(String label) {
			this.label = label;
		}	
	}