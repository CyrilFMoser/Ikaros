package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A], b: T_B[Byte, T_B[T_A, T_A]]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_A, b: Int, c: (T_A,T_A)) extends T_A
case class CC_D[C](a: CC_A, b: CC_B, c: (Int,CC_A)) extends T_B[C, T_B[C, Char]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_A(_, _), _, _) => 1 
}
}
// This is not matched: CC_A(_, _)