package Program_31 

package Program_1 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A], b: T_A, c: T_A) extends T_A
case class CC_B[C](a: Byte, b: CC_A) extends T_B[T_A, C]
case class CC_C[D, E](a: Char, b: T_A) extends T_B[T_A, D]
case class CC_D[F, G]() extends T_B[G, F]

val v_a: T_B[T_A, Byte] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_C(_, CC_A(_, _, _)) => 1 
  case CC_B(_, _) => 2 
  case CC_B(0, CC_A(_, _, _)) => 3 
}
}
// This is not matched: (CC_C Byte T_A Char Wildcard (T_B T_A Byte))
// This is not matched: (CC_A Wildcard (T_A (Tuple Int Int)))