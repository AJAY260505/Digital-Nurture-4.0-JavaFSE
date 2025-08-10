import React, { useState } from 'react';
import GuestPage from './GuestPage';
import UserPage from './UserPage';

function LoginControl() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLoginClick = () => setIsLoggedIn(true);
  const handleLogoutClick = () => setIsLoggedIn(false);

  let page, button;
  if (isLoggedIn) {
    page = <UserPage />;
    button = <button onClick={handleLogoutClick}>Logout</button>;
  } else {
    page = <GuestPage />;
    button = <button onClick={handleLoginClick}>Login</button>;
  }

  return (
    <div style={{ textAlign: 'center', marginTop: '20%' }}>
      {page}
      <div style={{ marginTop: '20px' }}>{button}</div>
    </div>
  );
}

export default LoginControl;
