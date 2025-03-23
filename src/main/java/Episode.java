public class Episode {
    private String name;
    private String seasonNum;
    private String episodeNum;
    private String directedBy;
    private String writtenBy;
    private String originalAirDate;
    private String description;

    public Episode(String name, String seasonNum, String episodeNum, String directedBy, String writtenBy, String originalAirDate, String description) {
        this.name = name;
        this.seasonNum = seasonNum;
        this.episodeNum = episodeNum;
        this.directedBy = directedBy;
        this.writtenBy = writtenBy;
        this.episodeNum = episodeNum;
        this.originalAirDate = originalAirDate;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getSeason() {
        return "Season " + seasonNum;
    }

    public String getEpisode() {
        return "Episode " + episodeNum;
    }

    public String getSeasonNumAndEpisodeNum() {
        return getSeason() + " " + getEpisode();
    }

    public String getDirectedBy() {
        return "Directed by " + directedBy;
    }

    public String getWrittenBy() {
        return "Written by " + writtenBy;
    }

    public String getOriginalAirDate() {
        return "Original air date " + originalAirDate;
    }

    public String getDescription() {
        return description;
    }
}
