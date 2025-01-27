package Program_15 

package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F]() extends T_A[E, (Int,Int)]
case class CC_B[G](a: CC_A[G, G], b: CC_A[G, G]) extends T_A[G, (Int,Int)]

val v_a: T_A[Boolean, (Int,Int)] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _) => 1 
}
}
// This is not matched: (CC_A Boolean Boolean (T_A Boolean (Tuple Int Int)))
// This is not matched: (CC_C Wildcard (CC_B Int (T_A Int)) (T_A (T_A Byte)))