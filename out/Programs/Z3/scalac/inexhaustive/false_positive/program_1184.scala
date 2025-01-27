package Program_30 

package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C]() extends T_A[D, C]
case class CC_B[E](a: E) extends T_B
case class CC_C() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C() => 1 
}
}
// This is not matched: (CC_B T_B Wildcard T_B)
// This is not matched: (CC_A Char Wildcard Wildcard (T_A Char))