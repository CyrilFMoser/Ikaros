package Program_14 

package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Byte) extends T_A
case class CC_B[C]() extends T_A
case class CC_C[D, E](a: T_B[D, E], b: CC_B[T_A], c: CC_A) extends T_B[D, E]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_A(0) => 1 
  case CC_B() => 2 
}
}
// This is not matched: (CC_B T_A T_A)
// This is not matched: (CC_A Wildcard Wildcard Wildcard (T_A (T_A Int)))