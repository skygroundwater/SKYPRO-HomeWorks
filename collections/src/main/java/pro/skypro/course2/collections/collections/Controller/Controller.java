package pro.skypro.course2.collections.collections.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.skypro.course2.collections.collections.AdditionalTasksForCollections.AdditionalTasks;
import pro.skypro.course2.collections.collections.AdditionalTasksForCollections.Item;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/tasks")
public class Controller {
    private final AdditionalTasks additionalTasks;
    public Controller(AdditionalTasks additionalTasks){
        this.additionalTasks = additionalTasks;
    }
    @GetMapping("/add")
    public void add(@RequestParam String key,@RequestParam String value){
        additionalTasks.add(key, value);
    }
    @GetMapping("/countSameWordsOfTheString")
    public HashMap<String, Integer> countSameWordsFromTheString(@RequestParam String s){
        return additionalTasks.countSameWordsFromTheString(s);
    }
    @GetMapping("/secondLargestValue")
    public double secondLargestValue(@RequestParam double[] doubles) {
        return additionalTasks.secondLargestValue(doubles);
    }
    @GetMapping("/changeValue")
    public Map<String, Item> mapShare(){
        return additionalTasks.mapShare();
    }
    @GetMapping("/remove")
    public void remove(String key){
        additionalTasks.remove(key);
    }
    @GetMapping("/removeAll")
    public void removeAll(){
        additionalTasks.removeAll();
    }
    @GetMapping("/showInfo")
    public Map<String,Item> showInfo(){
        return additionalTasks.showInfo();
    }
    @GetMapping("/mapAB")
    public Map<String,Item> mapAB(){
        return additionalTasks.mapAB();
    }
    @GetMapping("/topping")
    public Map<String,Item> topping(){
        return additionalTasks.topping();
    }
    @GetMapping("/word0")
    public Map<String,Integer> word0(@RequestParam String text){
        return additionalTasks.word0(text);
    }
    @GetMapping("/wordLen")
    public Map<String,Integer> wordLen(@RequestParam String text){
        return additionalTasks.wordLen(text);
    }
    @GetMapping("/pairs")
    public Map<String,String> pairs (@RequestParam String text){
        return additionalTasks.pairs(text);
    }
    @GetMapping("/evenOrOdd")
    public String evenOrOdd(String number){
        return additionalTasks.evenOrOdd(number);
    }
}
