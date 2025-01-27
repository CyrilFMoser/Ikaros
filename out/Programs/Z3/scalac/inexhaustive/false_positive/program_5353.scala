package Program_14 

package Program_10 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: (T_B,Boolean), b: T_A) extends T_A
case class CC_B[A](a: T_B, b: (Boolean,T_B), c: ((Boolean,Byte),CC_A)) extends T_B
case class CC_C(a: CC_A) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_B(CC_C(_), (_,CC_B(_, _, _)), ((_,_),CC_A(_, _))) => 1 
  case CC_B(CC_B(_, _, _), (_,CC_C(_)), ((_,_),CC_A(_, _))) => 2 
  case CC_B(_, (_,CC_B(_, _, _)), ((_,_),CC_A(_, _))) => 3 
  case CC_B(_, _, ((_,_),CC_A(_, _))) => 4 
  case CC_B(CC_C(_), _, _) => 5 
  case CC_B(CC_B(_, _, _), _, _) => 6 
  case CC_B(CC_C(_), _, ((_,_),CC_A(_, _))) => 7 
}
}
// This is not matched: (CC_B T_A Wildcard Wildcard Wildcard T_B)
// This is not matched: (CC_E T_B T_B)