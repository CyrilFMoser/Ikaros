package Program_30 

package Program_3 

object Test {
sealed trait T_A
case class CC_A() extends T_A
case class CC_B(a: CC_A, b: T_A) extends T_A
case class CC_C[A](a: CC_B, b: (T_A,T_A), c: Int) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, (CC_A(),CC_B(_, _)), _) => 2 
  case CC_C(CC_B(_, _), (CC_A(),CC_A()), 12) => 3 
  case CC_C(_, (CC_A(),CC_A()), _) => 4 
  case CC_C(CC_B(_, _), (CC_C(_, _, _),CC_B(_, _)), _) => 5 
  case CC_C(CC_B(_, _), (CC_C(_, _, _),CC_A()), 12) => 6 
  case CC_C(CC_B(_, _), (CC_C(_, _, _),CC_B(_, _)), 12) => 7 
  case CC_C(_, (CC_B(_, _),CC_C(_, _, _)), 12) => 8 
  case CC_C(_, (CC_B(_, _),CC_A()), _) => 9 
  case CC_C(_, (CC_B(_, _),CC_C(_, _, _)), _) => 10 
  case CC_C(_, _, _) => 11 
  case CC_C(CC_B(_, _), (CC_A(),CC_B(_, _)), 12) => 12 
  case CC_C(_, (CC_C(_, _, _),CC_B(_, _)), 12) => 13 
  case CC_C(CC_B(_, _), (CC_B(_, _),CC_B(_, _)), 12) => 14 
  case CC_C(_, (CC_C(_, _, _),CC_C(_, _, _)), _) => 15 
  case CC_C(CC_B(_, _), (CC_C(_, _, _),CC_C(_, _, _)), _) => 16 
  case CC_C(CC_B(_, _), _, 12) => 17 
  case CC_C(CC_B(_, _), (CC_C(_, _, _),CC_A()), _) => 18 
  case CC_C(_, (CC_B(_, _),CC_A()), 12) => 19 
  case CC_C(_, (CC_A(),CC_A()), 12) => 20 
  case CC_C(_, (CC_B(_, _),CC_B(_, _)), 12) => 21 
}
}
// This is not matched: (CC_C (CC_A T_A) Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_E Wildcard (T_B (Tuple Byte Int) Boolean))