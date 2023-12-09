package com.ggardet.vtg.resources.post.service

import com.ggardet.vtg.resources.post.repository.PostRepository
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class PostService(val postRepository: PostRepository) {
    fun readPost(postId: UUID) = postRepository.findById(postId)
}
