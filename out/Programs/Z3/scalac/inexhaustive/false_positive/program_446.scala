package Program_31 

package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E](a: D, b: T_B[E, E]) extends T_A[D]
case class CC_B[F](a: F, b: T_A[F]) extends T_A[F]
case class CC_C[H, G]() extends T_B[G, H]
case class CC_D() extends T_B[T_A[Byte], T_B[Byte, Byte]]

val v_a: T_A[CC_D] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C()) => 0 
  case CC_A(CC_D(), _) => 1 
  case CC_A(CC_D(), CC_C()) => 2 
  case CC_B(CC_D(), CC_B(_, _)) => 3 
  case CC_B(_, _) => 4 
  case CC_B(_, CC_A(_, _)) => 5 
  case CC_B(CC_D(), _) => 6 
}
}
// This is not matched: (CC_A (CC_D Boolean) Boolean Wildcard Wildcard (T_A (CC_D Boolean)))
// This is not matched: Pattern match is empty without constants