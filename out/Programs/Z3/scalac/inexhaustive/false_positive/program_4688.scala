package Program_15 

package Program_13 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A[A](a: T_B, b: A) extends T_A
case class CC_B(a: (T_A,(Char,Byte)), b: T_B, c: CC_A[T_B]) extends T_A
case class CC_C(a: Boolean) extends T_A
case class CC_D[B](a: B, b: CC_B, c: CC_B) extends T_B
case class CC_E(a: CC_B, b: CC_C) extends T_B

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_A(_, _) => 1 
  case CC_B(_, CC_E(_, _), _) => 2 
  case CC_B((CC_C(_),(_,_)), _, CC_A(_, _)) => 3 
  case CC_B((CC_A(_, _),(_,_)), CC_E(_, _), CC_A(_, _)) => 4 
  case CC_B((CC_C(_),(_,_)), CC_D(_, _, _), _) => 5 
  case CC_B(_, _, _) => 6 
  case CC_B(_, CC_E(_, _), CC_A(_, _)) => 7 
  case CC_B(_, CC_D(_, _, _), _) => 8 
  case CC_B((CC_B(_, _, _),(_,_)), CC_D(_, _, _), _) => 9 
  case CC_B((CC_A(_, _),(_,_)), _, CC_A(_, _)) => 10 
  case CC_B((CC_B(_, _, _),(_,_)), CC_D(_, _, _), CC_A(_, _)) => 11 
  case CC_B((CC_B(_, _, _),(_,_)), CC_E(_, _), _) => 12 
  case CC_B(_, CC_D(_, _, _), CC_A(_, _)) => 13 
  case CC_B((CC_C(_),(_,_)), CC_D(_, _, _), CC_A(_, _)) => 14 
  case CC_B((CC_C(_),(_,_)), CC_E(_, _), CC_A(_, _)) => 15 
  case CC_B((CC_C(_),(_,_)), CC_E(_, _), _) => 16 
  case CC_B((CC_A(_, _),(_,_)), _, _) => 17 
  case CC_B((CC_B(_, _, _),(_,_)), _, CC_A(_, _)) => 18 
}
}
// This is not matched: (CC_A T_A (CC_E Wildcard Wildcard T_B) Wildcard T_A)
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)