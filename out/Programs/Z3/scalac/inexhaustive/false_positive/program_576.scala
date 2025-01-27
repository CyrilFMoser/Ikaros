package Program_31 

package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B, C](a: T_B) extends T_A[B]
case class CC_B[D](a: T_A[D]) extends T_A[D]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: (CC_A Byte T_B Wildcard (T_A Byte))
// This is not matched: (CC_C Int
//      (CC_B Int Wildcard (CC_C Int Wildcard (T_A Int)) Int (T_A Int))
//      (T_A Int))