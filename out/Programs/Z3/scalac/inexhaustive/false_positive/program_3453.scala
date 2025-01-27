package Program_14 

package Program_5 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: Char, b: T_B) extends T_A
case class CC_B(a: CC_A, b: T_A, c: (Char,Int)) extends T_A
case class CC_C[A]() extends T_B
case class CC_D(a: CC_A, b: (CC_B,CC_A), c: T_A) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_A(_, _), _, CC_B(_, _, _)) => 1 
  case CC_D(CC_A(_, _), (CC_B(_, _, _),CC_A(_, _)), _) => 2 
  case CC_D(CC_A(_, _), (CC_B(_, _, _),CC_A(_, _)), CC_A(_, _)) => 3 
  case CC_D(CC_A(_, _), _, CC_A(_, _)) => 4 
  case CC_D(_, (CC_B(_, _, _),CC_A(_, _)), CC_A(_, _)) => 5 
}
}
// This is not matched: (CC_C T_A T_B)
// This is not matched: (CC_A (CC_A Wildcard T_A) T_A)