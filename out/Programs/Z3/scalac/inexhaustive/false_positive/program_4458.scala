package Program_13 

package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C, E](a: T_A[C, T_B]) extends T_A[D, C]
case class CC_B[F](a: F) extends T_A[T_A[T_B, (Boolean,Int)], F]
case class CC_C[G](a: CC_B[G]) extends T_B
case class CC_D() extends T_B

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
}
}
// This is not matched: (CC_A Int Int T_B Wildcard (T_A Int Int))
// This is not matched: (CC_D (CC_A Boolean) Byte Wildcard Wildcard (T_B (CC_A Boolean) Byte))