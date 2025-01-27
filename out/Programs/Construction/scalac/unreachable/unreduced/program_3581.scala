package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Byte, b: T_B[T_A, T_B[T_A, T_A]]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_B[T_A, Boolean]) extends T_A
case class CC_D[C](a: Int) extends T_B[C, CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_A(_, _)