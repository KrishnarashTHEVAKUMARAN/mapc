package td3.visitable;

import td3.visitor.PrePostVisitor;
import td3.visitor.Visitor;

import java.util.Objects;

public class Ligne implements PrePostVisitable {
    private String name;
    private int sum;

    public Ligne(String name, int sum) {
        this.name = name;
        this.sum = sum;
    }
    public void accept(Visitor visitor){
        visitor.visit(this);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSum() {
        return this.sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public void accept(PrePostVisitor prePostVisitor) {
        prePostVisitor.preVisit(this);
        prePostVisitor.postVisit(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        Ligne ligne = (Ligne) obj;
        return sum == ligne.sum && name.equals(ligne.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.sum);
    }

    @Override
    public String toString() {
        return "Ligne{ name='" + this.name + '\'' + ", sum=" + this.sum + '}';
    }
}
