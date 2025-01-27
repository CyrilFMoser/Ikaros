package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: T_B[T_A], c: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C(a: Int, b: T_B[(CC_B,T_A)]) extends T_B[(CC_B,T_A)]
case class CC_D(a: CC_A) extends T_B[(CC_B,T_A)]
case class CC_E(a: T_B[(CC_B,T_A)], b: T_A, c: T_B[Int]) extends T_B[Int]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_E(_, _, CC_E(CC_C(_, _), CC_A(_, _, _), _)) => 0 
  case CC_E(_, _, CC_E(CC_D(_), CC_A(_, _, _), _)) => 1 
  case CC_E(_, _, CC_E(CC_D(_), CC_B(), _)) => 2 
}
}
// This is not matched: CC_E(_, _, CC_E(CC_C(_, _), CC_B(), _))