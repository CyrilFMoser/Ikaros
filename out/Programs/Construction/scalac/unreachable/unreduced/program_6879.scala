package Program_11 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Int, T_B[T_A, T_A]], b: T_B[T_A, T_B[T_A, T_A]]) extends T_A
case class CC_B(a: CC_A, b: Boolean, c: T_B[T_A, CC_A]) extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: CC_C) extends T_B[C, CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _), _, _) => 1 
  case CC_C() => 2 
}
}