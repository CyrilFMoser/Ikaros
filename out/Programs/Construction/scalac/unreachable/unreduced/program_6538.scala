package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, Int], b: T_B[T_B[T_A, T_A], T_A]) extends T_A
case class CC_B() extends T_A
case class CC_C[C](a: C, b: C) extends T_B[T_A, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_, _), _) => 0 
  case CC_B() => 1 
}
}