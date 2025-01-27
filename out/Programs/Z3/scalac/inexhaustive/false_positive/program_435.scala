package Program_31 

package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: C, b: Boolean) extends T_A[C]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(12, _) => 0 
  case CC_A(_, _) => 1 
}
}
// This is not matched: (CC_A Int Boolean Wildcard Wildcard (T_A Int))
// This is not matched: (CC_B T_A)