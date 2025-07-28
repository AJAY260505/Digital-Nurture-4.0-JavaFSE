// src/Cart.js
import React from 'react';

const Cart = ({ itemname, price }) => {
  return (
    <tr>
      <td>{itemname}</td>
      <td>{price}</td>
    </tr>
  );
};

export default Cart;
