package Program_13 

object Test {
sealed trait T_A
case class CC_A(a: T_A, b: T_A, c: T_A) extends T_A
case class CC_B(a: (CC_A,Byte), b: (CC_A,T_A)) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), _) => 0 
  case CC_A(CC_A(_, _, _), CC_B(_, _), _) => 1 
  case CC_A(CC_B((_,_), (_,_)), CC_A(_, _, _), _) => 2 
  case CC_A(CC_B((_,_), (_,_)), CC_B(_, _), _) => 3 
  case CC_B((CC_A(_, _, _),_), _) => 4 
}
}