package Program_26 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: (CC_A,T_A)) extends T_A
case class CC_C(a: CC_A, b: T_B[CC_A]) extends T_A
case class CC_D(a: T_A, b: T_B[Int]) extends T_B[Int]
case class CC_E[B]() extends T_B[Int]
case class CC_F() extends T_B[Int]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((CC_A(),CC_A())) => 1 
  case CC_B((CC_A(),CC_C(_, _))) => 2 
  case CC_C(CC_A(), _) => 3 
}
}
// This is not matched: CC_B((CC_A(),CC_B(_)))