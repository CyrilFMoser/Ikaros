package Program_13 

package Program_4 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[C]) extends T_A[B]
case class CC_B[D, E](a: D, b: CC_A[E, D], c: T_A[E]) extends T_A[D]
case class CC_C[F](a: CC_B[Int, F], b: (Int,Byte)) extends T_A[F]

val v_a: CC_A[Boolean, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
}
}
// This is not matched: (CC_A Boolean
//      Boolean
//      (CC_C Boolean Wildcard Wildcard (T_A Boolean))
//      (T_A Boolean))
// This is not matched: (CC_A Int (T_A Int))