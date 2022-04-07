import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Main {
    static CSVParser csv = new CSVParser("Wordle.csv");
    public static void main(String[] args) throws MalformedURLException {
        String[] list1 = {
            "have", "that", "with", "this","they", "that", "from", "what", "know", "make", "will", "year", "time", "when", "them", "just", "some", "take", "into", "your", "come", "than", "like", "then", "more", "want", "look", "also", "more", "here", "well", "find", "very", "tell", "many", "give", "only", "back", "even", "good", "life", "down", "work", "call", "over", "last", "need", "feel", "when", "high", "most", "much", "mean", "keep", "talk", "hand", "same", "turn", "seem", "help", "over", "show", "part", "such", "case", "week", "most", "each", "hear", "play", "work", "like", "move", "hold", "next", "live", "room", "must", "home", "area", "fact", "head", "kind", "book", "word", "side", "four", "long", "both", "game", "away", "long", "hour", "line", "ever", "lose", "city", "team", "meet", "face", "name", "once", "much", "five", "body", "back", "door", "best", "real", "lead", "idea", "stop", "such", "only", "sure", "read", "walk", "open", "girl", "grow", "food", "foot", "both", "love", "yeah", "able", "wait", "home", "stay", "fall", "send", "plan", "kill", "care", "role", "else", "sell", "pull", "rate", "show", "hard", "late", "drug", "pass", "wife", "less", "mind", "free", "hope", "view", "road", "join", "town", "true", "even", "form", "wear", "full", "pick", "data", "site", "base", "need", "star", "cost", "easy", "wall", "half", "news", "test", "land", "hair", "face", "type", "baby", "love", "open", "film", "tree", "step", "look", "draw", "soon", "term", "less", "well", "rule", "risk", "call", "fire", "bank", "goal", "seek", "west", "deal", "thus", "upon", "note", "fill", "rest", "past", "drop", "push", "page", "plan", "than", "fine", "dead", "near", "race", "fund", "poor", "each", "rise", "east", "save", "away", "size", "hard", "list", "left", "sign", "loss", "bill", "deal", "blue", "dark", "fail", "name", "sort", "hang", "miss", "song", "rock", "cell", "nice", "note", "firm", "cold", "form", "seat", "help", "main", "card", "onto", "ball", "that", "talk", "care", "huge", "play", "head", "fish", "pain", "wide", "base", "unit", "edge", "trip", "heat", "item", "deep", "best", "skin", "down", "past", "vote", "sign", "step", "yard", "task", "fear", "fall", "test", "sing", "tend", "beat", "whom", "wish", "shot", "safe", "wind", "rich", "like", "fast", "none", "born", "vote", "cost", "bird", "hurt", "hope", "nine", "turn", "camp", "ship", "park", "text", "hole", "once", "lack", "boat", "very", "wood", "spot", "roll", "date", "hide", "club", "gold", "gain", "ride", "farm", "tool", "band", "tiny", "earn", "kind", "wild", "lift", "mean", "folk", "warm", "shop", "jump", "feed", "path", "past", "soft", "cook", "view", "blow", "suit", "gift", "grab", "shoe", "lean", "wave", "move", "wine", "deny", "burn", "bone", "cool", "knee", "tour", "tape", "next", "neck", "lady", "fire", "tall", "pair", "hire", "fair", "hate", "male", "shut", "salt", "will", "okay", "rain", "jury", "leaf", "poll", "fuel", "army", "lots", "desk", "pool", "lead", "thin", "soul", "male", "loan", "bear", "half", "code", "nose", "ring", "like", "meal", "deep", "cash", "link", "fear", "wake", "crew", "mark", "slip", "last", "snow", "golf", "soil", "sick", "file", "root", "user", "bowl", "zone", "slow", "meat", "hall", "duty", "stir", "just", "kick", "warn", "part", "bond", "tear", "mean", "late", "rely", "debt", "file", "gray", "host", "beer", "pour", "long", "back", "tank", "used", "seed", "wing", "cite", "rare", "rest", "dish", "core", "rush", "busy", "flow", "hero", "bomb", "copy", "hand", "lack", "hill", "mass", "rise", "gate", "tone", "vast", "milk", "ride", "land", "mind", "live", "bike", "plus", "cast", "wrap", "list", "diet", "dark", "Arab", "self", "drag", "weak", "roof", "wash", "bend", "chip", "kiss", "coat", "mark", "mass", "lake", "gain", "mine", "link", "post", "sand", "slow", "walk", "lock", "pass", "tear", "glad", "dust", "gene", "sale", "rule", "joke", "good", "pose", "pack", "iron", "boot", "tale", "bean", "vary", "urge", "sure", "ring", "peer", "twin", "boss", "toss", "peak", "king", "wire", "race", "mood", "luck", "stop", "holy", "bury", "ally", "pray", "moon", "pink", "belt", "corn", "crop", "poem", "buck", "pure", "flag", "wave", "soon", "line", "tube", "snap", "cake", "jail", "pack", "like", "date", "yell", "beat", "bind", "roll", "quit", "wage", "mail", "flat", "pace", "gear", "mine", "drop", "fast", "spin", "teen", "gang", "pant", "wipe", "bell", "bake", "rank", "bear", "mode", "dirt", "wind", "rice", "port", "lost", "deck", "deer", "pale", "sink", "tire", "oven", "pole", "fade", "flow", "swim", "mask", "spot", "palm", "hold", "free", "load", "poet", "lawn", "easy", "mere", "load", "tail", "pile", "soup", "fate", "flee", "plot", "pipe", "math", "aide", "loud", "heel", "rate", "menu", "fund", "mall", "myth", "chef", "tent", "sigh", "auto", "bite", "cope", "gaze", "pine", "acid", "host", "okay", "suit", "boom", "norm", "rope", "risk", "ugly", "ease", "lung", "dear", "wise", "peer", "odds", "slam", "firm", "dare", "rose", "cool", "stem", "sake", "bare", "coal", "rank", "rail", "hunt", "rape", "high", "mess", "clue", "park", "fold", "pump", "pill", "melt", "cold", "shop", "echo", "rent", "beef", "last", "evil", "leap", "duck", "lens", "dose", "herb", "cave", "nail", "suck", "trap", "limb", "warm", "pond", "lend", "tune", "past", "disk", "horn", "wish", "hers", "fork", "fist", "grip", "dump", "blue", "beam", "harm", "lock", "chin", "loud", "rush", "chop", "oral", "noon", "bias", "hook", "doll", "exit", "blow", "lamp", "flip", "ship", "amid", "grin", "jazz", "mild", "kiss", "peel", "bite", "bath", "silk", "sink", "evil", "slap", "fool", "hint", "feel", "bold", "dawn", "rear", "tune", "scan", "rage", "cook", "tuck", "cart", "hook", "barn", "pump", "wolf", "stem", "tide", "trap", "mate", "rack", "aunt", "seal", "clip", "heat", "wake", "cage", "post", "seal", "nest", "lane", "sail", "calm", "rock", "drum", "ours", "haul", "gaze", "rent", "bull", "star", "bush", "near", "root", "sock", "damn", "ruin", "pork", "whip", "seat", "boil", "coup", "exam", "loop", "edit", "hike", "ease", "near", "cute", "jump", "lion", "cord", "icon", "tray", "cast", "soap", "coin", "grin", "sack", "harm", "sort", "heal", "case", "stay", "shed", "mill", "chew", "weed", "deem", "skip", "pile", "rain", "toll", "atop", "joke", "poke", "sole", "this", "part", "sofa", "butt", "dumb", "fame", "cure", "goat", "cure", "disc", "fare", "neat", "soar", "bulk", "calm", "clay", "spit", "bomb", "till", "riot", "tile", "soak", "fish", "dock", "bulb", "bolt", "slot", "trim", "till", "plea", "copy"
        };

        String[] list2 = csv.getList();

        Scanner sc = new Scanner(System.in);
        System.out.println("\n Type a word to be guessed or type 'list' to use the list of 5 letter words"); 
        String word = sc.nextLine();

        if(word.equals("list")) {

            //4 letter words
            // Thread monkey1 = new Thread(new MultiThread(list1));
            // monkey1.start();
                        
            Thread monkey2 = new Thread(new MultiThread(list2));
            monkey2.start();

            startGif();

        
        
        }
        else {
            Thread monkey1 = new Thread(new MultiThread(word));
            monkey1.start();
        }



    }


    public static void startGif() throws MalformedURLException {
        URL url = new URL("https://c.tenor.com/JJ_is357rXYAAAAd/spike-monkey-typing.gif");
        Icon icon = new ImageIcon(url);
        JLabel label = new JLabel(icon);
        JLabel text = new JLabel("test");
     
        JFrame f = new JFrame("Animation");
        f.getContentPane().add(text);
        f.getContentPane().add(label);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setLocationRelativeTo(null);
        
        f.setVisible(true);
    }

}