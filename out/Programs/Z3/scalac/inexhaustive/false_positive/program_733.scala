package Program_31 

package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: T_B[C]) extends T_A[C]
case class CC_B[E]() extends T_B[E]
case class CC_C[F](a: Byte, b: Char) extends T_B[F]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Boolean Boolean Wildcard (T_A Boolean))
// This is not matched: (CC_D Char Byte Wildcard Wildcard Int (T_B Char Byte))