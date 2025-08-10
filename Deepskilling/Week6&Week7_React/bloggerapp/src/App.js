import { useState } from 'react';
import CourseDetails from './CourseDetails';
import BookDetails from './BookDetails';
import BlogDetails from './BlogDetails';
import './App.css'; 

function App() {
  const [view, setView] = useState('all');

  const courses = [
    { id: 1, cname: "Angular", date: "4/8/2025" },
    { id: 2, cname: "React", date: "6/8/2025" }
  ];

  const books = [
    { id: 1, bname: "Master React", price: 670 },
    { id: 2, bname: "Deep Dive into Angular 11", price: 800 },
    { id: 3, bname: "Mongo Essentials", price: 450 }
  ];

  const blogs = [
    { id: 1, title: "React Learning", author: "Ajay", content: "Welcome to learning React!" },
    { id: 2, title: "Installation", author: "ajay", content: "You can install React from npm." }
  ];

  return (
    <>
      <div className="button-group">
        <button onClick={() => setView('courses')}>Show Courses</button>
        <button onClick={() => setView('books')}>Show Books</button>
        <button onClick={() => setView('blogs')}>Show Blogs</button>
        <button onClick={() => setView('all')}>Show All</button>
      </div>

      <div className="details-container">
        {(view === 'courses' || view === 'all') && (
          <div className="section">
            <CourseDetails courses={courses} />
          </div>
        )}

        {(view === 'books' || view === 'all') && (
          <div className="section">
            <BookDetails books={books} />
          </div>
        )}

        {(view === 'blogs' || view === 'all') && (
          <div className="section">
            <BlogDetails blogs={blogs} />
          </div>
        )}
      </div>
    </>
  );
}

export default App;
