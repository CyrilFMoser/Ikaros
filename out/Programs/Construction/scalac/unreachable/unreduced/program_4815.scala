package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_B[CC_A, Boolean]) extends T_A
case class CC_C(a: T_A, b: T_B[T_B[(Boolean,Boolean), T_A], (CC_A,CC_B)]) extends T_A
case class CC_D[C](a: C) extends T_B[(Int,Char), C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_)) => 1 
  case CC_A(CC_C(_, _)) => 2 
  case CC_C(_, _) => 3 
}
}
// This is not matched: CC_B(_)