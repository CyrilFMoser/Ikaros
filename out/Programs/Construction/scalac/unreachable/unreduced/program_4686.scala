package Program_22 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[Int, T_A], T_B[T_A, T_A]]) extends T_A
case class CC_B() extends T_A
case class CC_C[C](a: T_A) extends T_B[C, T_A]
case class CC_D(a: T_A, b: Char) extends T_B[T_B[CC_A, T_A], T_A]

val v_a: CC_C[CC_A] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_)) => 0 
  case CC_C(CC_B()) => 1 
}
}