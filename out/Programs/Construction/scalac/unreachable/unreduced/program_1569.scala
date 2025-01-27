package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, T_A], T_B[Int, T_A]], b: Char, c: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_B) extends T_A
case class CC_D(a: (T_A,T_B[Int, CC_B]), b: T_B[CC_B, CC_A]) extends T_B[T_A, T_B[CC_C, CC_A]]
case class CC_E[C]() extends T_B[T_A, T_B[CC_C, CC_A]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(CC_B()) => 2 
}
}