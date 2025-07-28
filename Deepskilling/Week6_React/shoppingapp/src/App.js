// src/App.js
import React from 'react';
import Cart from './Cart';
import './App.css';

class OnlineShopping extends React.Component {
  render() {
    const cartItems = [
      { itemname: 'Laptop', price: 80000 },
      { itemname: 'TV', price: 120000 },
      { itemname: 'Washing Machine', price: 50000 },
      { itemname: 'Mobile', price: 30000 },
      { itemname: 'Fridge', price: 70000 },
    ];

    return (
      <div className="center-screen">
        <h1 className="heading">Items Ordered :</h1>
        <table className="item-table">
          <thead>
            <tr>
              <th>Name</th>
              <th>Price</th>
            </tr>
          </thead>
          <tbody>
            {cartItems.map((item, index) => (
              <Cart key={index} itemname={item.itemname} price={item.price} />
            ))}
          </tbody>
        </table>
      </div>
    );
  }
}

export default OnlineShopping;
