package Program_30 

package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D, F](a: T_A[D, E]) extends T_A[E, D]
case class CC_B[G](a: G) extends T_A[T_A[Char, Int], G]
case class CC_C[H](a: Byte, b: H, c: T_A[Boolean, H]) extends T_B[H]
case class CC_D(a: T_A[Char, Boolean], b: T_A[Boolean, Byte]) extends T_B[T_A[Char, Char]]

val v_a: CC_A[Char, Byte, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
}
}
// This is not matched: (CC_A Char
//      Byte
//      Char
//      (CC_A Byte Char Boolean Wildcard (T_A Byte Char))
//      (T_A Char Byte))
// This is not matched: (CC_C T_A Wildcard Wildcard Wildcard T_A)