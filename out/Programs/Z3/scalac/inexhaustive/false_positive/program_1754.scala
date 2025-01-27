package Program_31 

package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: CC_A, b: T_B[T_A, (Int,Boolean)], c: Boolean) extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: CC_C) extends T_B[CC_A, C]
case class CC_E[D, E](a: T_B[CC_A, D], b: T_B[D, D], c: Char) extends T_B[CC_A, D]

val v_a: T_B[CC_A, Int] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_D(CC_C()) => 1 
  case CC_E(_, _, _) => 2 
  case CC_E(_, _, 'x') => 3 
}
}
// This is not matched: (CC_E Int T_A Wildcard Wildcard Char (T_B (CC_A (T_B (T_B T_A T_A) T_A)) Int))
// This is not matched: (CC_A (CC_D T_A (T_B T_A)) Wildcard Wildcard T_A)