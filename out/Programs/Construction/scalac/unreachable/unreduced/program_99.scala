package Program_21 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_A, b: Int) extends T_A
case class CC_C(a: (CC_B,T_A), b: T_A) extends T_B[T_B[Int]]
case class CC_D(a: CC_C) extends T_B[T_B[Int]]
case class CC_E(a: CC_B, b: T_B[CC_A], c: T_A) extends T_B[T_B[Int]]

val v_a: T_B[T_B[Int]] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_)) => 0 
  case CC_D(CC_C(_, _)) => 1 
  case CC_E(CC_B(_, _), _, CC_A(_)) => 2 
  case CC_E(CC_B(_, _), _, CC_B(_, _)) => 3 
}
}
// This is not matched: CC_C(_, CC_B(_, _))