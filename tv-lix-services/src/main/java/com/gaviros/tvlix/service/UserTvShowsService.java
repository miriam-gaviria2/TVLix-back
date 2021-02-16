package com.gaviros.tvlix.service;

import java.util.List;

import javax.validation.Valid;

import com.gaviros.tvlix.entity.TvShow;
import com.gaviros.tvlix.entity.UserTvShow;

public interface UserTvShowsService {
	
	public abstract List<UserTvShow> getAllUserTvShows();

	public abstract List<UserTvShow> getUserTvShowsByStatus(@Valid long userId, @Valid String watchedStatus);

	public abstract List<UserTvShow> getUserTvShows(@Valid long userId);

	public abstract boolean saveUserTvShow(@Valid UserTvShow userTvShow);

	public abstract boolean updateUserTvShow(@Valid UserTvShow userTvShow);

	public abstract boolean deleteTvShowUserById(@Valid long id);


}
