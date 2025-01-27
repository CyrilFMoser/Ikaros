package Program_1 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[(T_A,T_A)], b: T_B[T_A], c: T_A) extends T_A
case class CC_B(a: T_A, b: (CC_A,T_A)) extends T_A
case class CC_C() extends T_B[T_B[CC_A]]
case class CC_D(a: T_B[T_A], b: T_B[T_B[CC_A]]) extends T_B[T_B[CC_A]]
case class CC_E() extends T_B[T_B[CC_A]]

val v_a: T_B[T_B[CC_A]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, CC_C()) => 1 
  case CC_D(_, CC_D(_, _)) => 2 
  case CC_D(_, CC_E()) => 3 
  case CC_E() => 4 
}
}