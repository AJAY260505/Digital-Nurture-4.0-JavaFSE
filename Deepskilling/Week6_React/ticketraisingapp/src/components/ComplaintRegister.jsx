import { useState } from 'react';

function ComplaintRegister() {
  const [formData, setFormData] = useState({
    ename: '',
    complaint: ''
  });

  const handleChange = (e) => {
    setFormData({
      ...formData,
      [e.target.name]: e.target.value
    });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    const transactionId = Math.floor(Math.random() * 1000) + 1;
    const msg = `Thanks ${formData.ename}\nYour Complaint was Submitted.\nTransaction ID is: ${transactionId}`;
    alert(msg);

    setFormData({ ename: '', complaint: '' });
  };

  return (
    <div style={{ textAlign: 'center', marginTop: '50px' }}>
      <h2 style={{ color: 'red', fontWeight: 'bold', fontSize: '24px' }}>
        Register your complaints here!!!
      </h2>
      <form onSubmit={handleSubmit} style={{ marginTop: '30px' }}>
        <div>
          <label>Name: </label>
          <input
            type="text"
            name="ename"
            value={formData.ename}
            onChange={handleChange}
            required
          />
        </div>
        <br />
        <div>
          <label>Complaint: </label>
          <textarea
            name="complaint"
            value={formData.complaint}
            onChange={handleChange}
            rows={4}
            cols={30}
            required
          />
        </div>
        <br />
        <button type="submit">Submit</button>
      </form>
    </div>
  );
}

export default ComplaintRegister;
