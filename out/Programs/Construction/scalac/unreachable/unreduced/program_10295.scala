package Program_20 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Boolean, b: T_B[T_B[T_A, T_A], Int]) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C[C]() extends T_A
case class CC_D[D](a: T_A, b: T_B[D, D]) extends T_B[D, (CC_B,Boolean)]
case class CC_E() extends T_B[CC_A, (CC_B,Boolean)]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _)) => 0 
  case CC_B(CC_B(CC_B(_))) => 1 
  case CC_B(CC_B(CC_C())) => 2 
  case CC_B(CC_C()) => 3 
}
}
// This is not matched: CC_B(CC_B(CC_A(_, _)))