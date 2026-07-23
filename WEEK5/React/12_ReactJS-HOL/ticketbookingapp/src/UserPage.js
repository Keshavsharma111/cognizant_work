import Flights from "./Flights";

function UserPage() {
  return (
    <div>
      <h1>Welcome User</h1>

      <p>You can now book your tickets.</p>

      <Flights />

      <button>Book Ticket</button>
    </div>
  );
}

export default UserPage;