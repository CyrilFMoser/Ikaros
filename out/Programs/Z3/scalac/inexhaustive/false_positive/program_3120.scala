package Program_14 

package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[Int], b: Boolean) extends T_A[C]
case class CC_B[D, E](a: T_A[E]) extends T_A[D]
case class CC_C[F](a: CC_A[F], b: F) extends T_B[F]
case class CC_D(a: CC_C[Int], b: T_A[Byte], c: Byte) extends T_B[(Byte,Int)]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_), _) => 0 
  case CC_A(_, _) => 1 
  case CC_B(CC_A(_, _)) => 2 
  case CC_B(_) => 3 
}
}
// This is not matched: (CC_B Boolean (T_A Boolean) Wildcard (T_A Boolean))
// This is not matched: (CC_D Boolean Boolean Wildcard Wildcard (T_B Boolean))