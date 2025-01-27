package Program_14 

package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: C, b: C) extends T_A[C, T_A[C, C]]
case class CC_B[E](a: CC_A[E, E]) extends T_A[E, T_A[E, E]]
case class CC_C[F, G]() extends T_A[G, F]

val v_a: T_A[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, 0) => 0 
  case CC_A(_, _) => 1 
  case CC_A(0, _) => 2 
  case CC_B(CC_A(_, _)) => 3 
  case CC_C() => 4 
}
}
// This is not matched: (CC_A Byte T_B Byte Wildcard (T_A Byte (T_A Byte Byte)))
// This is not matched: (CC_A Byte T_B Byte Wildcard (T_A Byte (T_A Byte Byte)))