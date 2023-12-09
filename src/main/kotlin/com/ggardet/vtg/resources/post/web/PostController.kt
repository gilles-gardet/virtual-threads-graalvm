package com.ggardet.vtg.resources.post.web

import com.ggardet.vtg.resources.post.model.Post
import com.ggardet.vtg.resources.post.service.PostService
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.UUID
import kotlin.jvm.optionals.getOrElse

@RestController
@RequestMapping("/posts")
class PostController(val postService: PostService) {
    @GetMapping("/{postId}")
    fun readPost(@PathVariable postId: UUID): Post {
        Thread.sleep(2_000)
        return postService.readPost(postId).getOrElse { throw NotFoundException() }
    }
}
