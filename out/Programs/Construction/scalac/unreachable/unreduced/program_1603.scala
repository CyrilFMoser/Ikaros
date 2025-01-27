package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: CC_A, b: (T_B[T_A, Boolean],CC_A), c: T_B[T_A, T_A]) extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: T_B[C, T_B[CC_A, Byte]]) extends T_B[C, Byte]
case class CC_E[D]() extends T_B[D, Byte]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_C()