package Program_30 

package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: T_A[C, C]) extends T_A[C, T_A[(Int,Int), Boolean]]
case class CC_B[D, E](a: E, b: E, c: Byte) extends T_A[D, T_A[(Int,Int), Boolean]]
case class CC_C[F](a: CC_A[F], b: CC_A[F]) extends T_A[F, T_A[(Int,Int), Boolean]]

val v_a: T_A[Boolean, T_A[(Int,Int), Boolean]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_B(_, _, 0) => 1 
  case CC_A(_, _, _) => 2 
  case CC_C(_, CC_A(_, _, _)) => 3 
}
}
// This is not matched: (CC_B Boolean
//      (CC_A Boolean Boolean Boolean Boolean Boolean)
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_A Boolean (T_A (Tuple Int Int) Boolean)))
// This is not matched: (CC_B T_A)