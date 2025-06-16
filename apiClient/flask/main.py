from flask import Flask, jsonify

app = Flask(__name__)

@app.route("/hello")
def hello():
    return jsonify(message="Hello from flask...another hello from flask")

if __name__ == "__main__":
    app.run(debug=True, host="127.0.0.100", port="12345")
