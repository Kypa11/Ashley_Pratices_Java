// ---------------------------
// CONSTRUCTOR FUNCTION: Idea
// ---------------------------
// Creates idea objects with title, market, summary, research notes, and votes

function Idea(title, market, summary) {
  this.title = title;
  this.market = market;
  this.summary = summary;
  this.research = [];
  this.upvotes = 0;
  this.downvotes = 0;
}

// ---------------------------
// PROTOTYPE METHODS
// ---------------------------

// Add a research note
Idea.prototype.addResearch = function(note, source) {
  const entry = {
    note,
    source: source || "unknown",
    date: new Date().toISOString()
  };
  this.research.push(entry);
  return entry;
};

// Return idea summary
Idea.prototype.info = function() {
  return `Idea title: ${this.title}, Market: ${this.market}, Score: ${this.score()}`;
};

// Calculate idea score
Idea.prototype.score = function() {
  return this.upvotes - this.downvotes + this.research.length;
};

// Voting methods
Idea.prototype.upvote = function() { this.upvotes++; };
Idea.prototype.downvote = function() { this.downvotes++; };

// ---------------------------
// TESTING IDEA
// ---------------------------
const i1 = new Idea("Smart Translate", "ESL & ASL", "translation available for all");
console.log(i1.info());

// ---------------------------
// CLASS: User
// ---------------------------
class User {
  constructor(name) {
    this.name = name;
    this.bookmarks = [];
  }

  // Add idea to bookmarks
  bookmarkIdea(idea) {
    if (!(idea instanceof Idea)) return console.log(`${this.name}: can't bookmark.`);
    if (!this.bookmarks.includes(idea)) {
      this.book
