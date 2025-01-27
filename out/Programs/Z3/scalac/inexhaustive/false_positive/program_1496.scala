package Program_31 

package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: T_B[C], b: Byte) extends T_A[C]
case class CC_B[E](a: T_A[E], b: CC_A[E, E]) extends T_B[E]
case class CC_C[F](a: T_B[F], b: F, c: CC_A[Char, F]) extends T_B[F]
case class CC_D(a: T_A[Int], b: Byte, c: T_B[(Boolean,Char)]) extends T_B[CC_B[Int]]

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _), _, _) => 0 
  case CC_D(_, 0, CC_B(_, _)) => 1 
  case CC_D(_, 0, CC_C(_, _, _)) => 2 
  case CC_D(_, 0, _) => 3 
  case CC_D(CC_A(_, _), _, CC_B(_, _)) => 4 
  case CC_D(CC_A(_, _), 0, _) => 5 
}
}
// This is not matched: (CC_D (CC_A Int Boolean Wildcard Wildcard (T_A Int))
//      Wildcard
//      Wildcard
//      (T_B (CC_B Int Boolean Boolean Boolean)))
// This is not matched: (CC_B (CC_C T_A (T_B T_A))
//      Wildcard
//      (CC_C (Tuple Boolean Char) (T_B (Tuple Boolean Char)))
//      T_A)