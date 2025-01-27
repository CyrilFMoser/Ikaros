package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Boolean, b: T_A, c: T_A) extends T_A
case class CC_B(a: T_B[T_B[CC_A, CC_A], CC_A]) extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: T_A) extends T_B[CC_A, C]
case class CC_E[D](a: T_A) extends T_B[D, T_A]

val v_a: T_B[CC_A, Boolean] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, CC_A(_, _, _), _)) => 0 
  case CC_D(CC_A(_, CC_B(_), _)) => 1 
  case CC_D(CC_A(_, CC_C(), _)) => 2 
  case CC_D(CC_B(_)) => 3 
  case CC_D(CC_C()) => 4 
}
}