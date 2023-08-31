package com.atiper.atiperatask.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GithubRepositoryResponse {
    private long id;
    private String nodeId;
    private String name;
    private String fullName;
    private OwnerDto owner;
    private boolean isPrivate;
    private String htmlUrl;
    private String description;
    private boolean isFork;
    private String url;
    private String archiveUrl;
    private String assigneesUrl;
    private String blobsUrl;
    private String branchesUrl;
    private String collaboratorsUrl;
    private String commentsUrl;
    private String commitsUrl;
    private String compareUrl;
    private String contentsUrl;
    private String contributorsUrl;
    private String deploymentsUrl;
    private String downloadsUrl;
    private String eventsUrl;
    private String forksUrl;
    private String gitCommitsUrl;
    private String gitRefsUrl;
    private String gitTagsUrl;
    private String gitUrl;
    private String issueCommentUrl;
    private String issueEventsUrl;
    private String issuesUrl;
    private String keysUrl;
    private String labelsUrl;
    private String languagesUrl;
    private String mergesUrl;
    private String milestonesUrl;
    private String notificationsUrl;
    private String pullsUrl;
    private String releasesUrl;
    private String sshUrl;
    private String stargazersUrl;
    private String statusesUrl;
    private String subscribersUrl;
    private String subscriptionUrl;
    private String tagsUrl;
    private String teamsUrl;
    private String treesUrl;
    private String cloneUrl;
    private String mirrorUrl;
    private String hooksUrl;
    private String svnUrl;
    private String homepage;
    private String language;
    private int forksCount;
    private int stargazersCount;
    private int watchersCount;
    private int size;
    private String defaultBranch;
    private int openIssuesCount;
    private boolean isTemplate;
    private List<String> topics;
    private boolean hasIssues;
    private boolean hasProjects;
    private boolean hasWiki;
    private boolean hasPages;
    private boolean hasDownloads;
    private boolean hasDiscussions;
    private boolean archived;
    private boolean disabled;
    private String visibility;
    private String pushedAt;
    private String createdAt;
    private String updatedAt;
    private PermissionsDto permissions;
    private SecurityAndAnalysisDto securityAndAnalysis;
}
