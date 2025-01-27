package Program_14 

package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: Byte) extends T_A[C]
case class CC_B[E, F](a: Byte, b: (Int,Char)) extends T_A[E]
case class CC_C[G](a: T_A[G], b: CC_B[G, G]) extends T_B[G]

val v_a: CC_C[Char] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_), _) => 0 
  case CC_C(CC_B(_, _), CC_B(_, _)) => 1 
}
}
// This is not matched: (CC_C Char (CC_A Char Boolean Byte (T_A Char)) Wildcard (T_B Char))
// This is not matched: (CC_A T_A)