package Program_14 

package Program_10 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: B, b: Byte) extends T_A[B]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_A(12, _) => 1 
  case CC_A(12, 0) => 2 
}
}
// This is not matched: (CC_A Int Boolean Wildcard Wildcard (T_A Int))
// This is not matched: (CC_B T_A Wildcard Wildcard T_A)