package Program_28 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[T_B[T_A, T_A], Byte], b: Char, c: T_B[T_B[(Char,Boolean), T_A], T_B[T_A, T_A]]) extends T_A
case class CC_C() extends T_A
case class CC_D[C]() extends T_B[C, CC_C]
case class CC_E[D]() extends T_B[D, CC_C]
case class CC_F[E, F]() extends T_B[E, CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A()