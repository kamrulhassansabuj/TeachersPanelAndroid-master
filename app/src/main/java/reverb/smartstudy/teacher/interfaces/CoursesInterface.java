package reverb.smartstudy.teacher.interfaces;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import reverb.smartstudy.teacher.model.Courses;
import reverb.smartstudy.teacher.model.News;
import reverb.smartstudy.teacher.model.NewsRequest;

/**
 * Created by sabujsahi on 19/11/17.
 */

public interface CoursesInterface {
    @POST("api/teacher/courselist")

    Call<ArrayList<Courses>> getcourses(@Body NewsRequest newsRequest);
}
