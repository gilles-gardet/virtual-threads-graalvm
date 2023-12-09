package com.ggardet.vtg.resources.post.repository

import com.ggardet.vtg.resources.post.model.Post
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface PostRepository: JpaRepository<Post, UUID>
