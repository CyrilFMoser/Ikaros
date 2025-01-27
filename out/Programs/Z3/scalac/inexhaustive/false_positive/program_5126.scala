package Program_15 

package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: T_B[C]) extends T_A[C]
case class CC_B[E](a: T_A[E], b: T_A[(Boolean,Byte)]) extends T_A[E]
case class CC_C[F](a: F) extends T_B[F]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_)) => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: (CC_A Byte (T_A Boolean) Wildcard (T_A Byte))
// This is not matched: (CC_B Char Byte Char (CC_B Char Wildcard Char Wildcard (T_A Char)) (T_A Char))