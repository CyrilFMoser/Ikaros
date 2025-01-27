package Program_30 

package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[Int], b: T_B[Char, Char]) extends T_A[T_B[(Byte,Int), Boolean]]
case class CC_B(a: T_A[CC_A]) extends T_A[T_B[(Byte,Int), Boolean]]
case class CC_C[D, E, F](a: F) extends T_B[D, E]
case class CC_D[G, H, I]() extends T_B[H, G]

val v_a: T_A[T_B[(Byte,Int), Boolean]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_A(_, CC_D()) => 1 
}
}
// This is not matched: (CC_A Wildcard
//      (CC_C Char Char Boolean Wildcard (T_B Char Char))
//      (T_A (T_B (Tuple Byte Int) Boolean)))
// This is not matched: (CC_C T_A Wildcard Wildcard Wildcard T_A)