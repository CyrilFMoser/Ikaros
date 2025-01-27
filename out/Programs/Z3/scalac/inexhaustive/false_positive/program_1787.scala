package Program_30 

package Program_11 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[Byte], b: B) extends T_A[B]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}
// This is not matched: (CC_A Int Boolean Wildcard Wildcard (T_A Int))
// This is not matched: (CC_C (CC_A Wildcard Wildcard T_A) T_A)