package Program_31 

package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C, b: C) extends T_A[C]
case class CC_B[D, E](a: D, b: E, c: CC_A[Byte]) extends T_B[D]
case class CC_C[F](a: T_A[F]) extends T_B[F]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_B(_, _, CC_A(_, _)) => 1 
}
}
// This is not matched: (CC_B Char Boolean Wildcard Boolean (CC_A Byte Byte Byte (T_A Byte)) (T_B Char))
// This is not matched: (CC_B Wildcard Wildcard T_A)