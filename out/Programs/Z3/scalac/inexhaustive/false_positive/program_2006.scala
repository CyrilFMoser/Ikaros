package Program_30 

package Program_4 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[B], b: C) extends T_A[B]
case class CC_B[D]() extends T_A[D]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_, _) => 1 
}
}
// This is not matched: (CC_A Char Boolean Wildcard Wildcard (T_A Char))
// This is not matched: (CC_A (CC_C (Tuple Boolean Boolean) (T_B (Tuple Boolean Boolean)))
//      Wildcard
//      Wildcard
//      T_A)