package Program_15 

package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: T_A[D, C]) extends T_A[D, C]
case class CC_B[E, F, G](a: CC_A[E, G]) extends T_A[E, F]

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_A(CC_B(_)) => 1 
  case CC_B(CC_A(_)) => 2 
}
}
// This is not matched: (CC_B Int Int Boolean Wildcard (T_A Int Int))
// This is not matched: (CC_E Int Int (T_B Int Int))