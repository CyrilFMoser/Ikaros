package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[E, F](a: T_A[E, E]) extends T_A[E, F]
case class CC_B[H, G]() extends T_A[H, G]

val v_a: CC_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
}
}
// This is not matched: (CC_A Byte Byte (T_A Byte Byte))