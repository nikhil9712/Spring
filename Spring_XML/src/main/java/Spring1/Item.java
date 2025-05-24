package Spring1;

public class Item {
String name;
int cost;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
@Override
public String toString() {
	return "Item [name=" + name + ", cost=" + cost + "]";
}


}
