package Program_15 

package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: C) extends T_A[C, D]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
  case CC_A(_) => 1 
}
}
// This is not matched: (CC_A Byte Int Boolean Wildcard (T_A Int Byte))
// This is not matched: (CC_B Wildcard T_A)