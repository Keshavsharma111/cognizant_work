import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";
import CourseDetails from "./CourseDetails";

function App() {

  const flag = true;

  return (

    <div>

      <h1>Blogger App</h1>

      {flag ? (

        <BookDetails />

      ) : (

        <BlogDetails />

      )}

      <CourseDetails />

    </div>

  );

}

export default App;