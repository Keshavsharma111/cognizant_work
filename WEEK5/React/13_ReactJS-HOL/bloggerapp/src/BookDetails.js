function BookDetails() {

  const books = [

    { id: 1, name: "React", price: 650 },

    { id: 2, name: "Java", price: 550 },

    { id: 3, name: "Python", price: 700 }

  ];

  return (

    <div>

      <h2>Book Details</h2>

      <ul>

        {books.map(book => (

          <li key={book.id}>
            {book.name} - ₹{book.price}
          </li>

        ))}

      </ul>

    </div>

  );

}

export default BookDetails;