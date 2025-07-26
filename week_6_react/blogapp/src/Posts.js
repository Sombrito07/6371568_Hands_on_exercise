import React from 'react';

class Posts extends React.Component {
  // Initialize state in the constructor [cite: 21]
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      error: null
    };
  }

  // Method to fetch data from the API [cite: 22]
  async loadPosts() {
    try {
      const response = await fetch('https://jsonplaceholder.typicode.com/posts'); // [cite: 23]
      if (!response.ok) {
        throw new Error('Something went wrong!');
      }
      const data = await response.json();
      this.setState({ posts: data });
    } catch (error) {
      this.setState({ error: error.message });
    }
  }

  // Call loadPosts() after the component mounts [cite: 25]
  componentDidMount() {
    this.loadPosts();
  }

  // Handle errors that occur in child components [cite: 29]
  componentDidCatch(error, info) {
    alert(`Error: ${error.message}`);
    console.error("Caught error:", error, info);
  }

  // Render the list of posts [cite: 27]
  render() {
    if (this.state.error) {
        return <div>Error: {this.state.error}</div>;
    }

    return (
      <div>
        <h1>Blog Posts</h1>
        {this.state.posts.map(post => (
          <article key={post.id}>
            <h2>{post.title}</h2>
            <p>{post.body}</p>
          </article>
        ))}
      </div>
    );
  }
}

export default Posts;