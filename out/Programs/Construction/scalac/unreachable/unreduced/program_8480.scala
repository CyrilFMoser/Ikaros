package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[Char, T_A]) extends T_A
case class CC_B[C](a: CC_A) extends T_B[T_B[CC_A, T_B[CC_A, T_A]], C]
case class CC_C[D]() extends T_B[T_B[CC_A, T_B[CC_A, T_A]], D]

val v_a: T_B[T_B[CC_A, T_B[CC_A, T_A]], T_A] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _)) => 0 
  case CC_C() => 1 
}
}