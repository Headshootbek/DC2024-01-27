package by.denisova.jpa.util.dto.comment.response;

import by.denisova.jpa.dto.response.CommentResponseDto;
import by.denisova.jpa.util.TestBuilder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.With;

@AllArgsConstructor
@NoArgsConstructor(staticName = "note")
@With
public class CommentResponseDtoTestBuilder implements TestBuilder<CommentResponseDto> {

    private Long id = 1L;
    private Long storyId = 1L;
    private String content = "content";

    @Override
    public CommentResponseDto build() {
        CommentResponseDto note = new CommentResponseDto();

        note.setId(id);
        note.setContent(content);
        note.setStoryId(storyId);

        return note;
    }
}