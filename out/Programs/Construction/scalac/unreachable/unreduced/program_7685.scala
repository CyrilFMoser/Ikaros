package Program_25 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: (T_A,T_B[T_A]), b: T_A, c: T_B[T_A]) extends T_A
case class CC_B() extends T_A
case class CC_C() extends T_A
case class CC_D(a: T_A, b: Boolean, c: CC_A) extends T_B[CC_A]
case class CC_E(a: CC_D, b: CC_A, c: CC_D) extends T_B[CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _, _), _), _) => 0 
  case CC_A(_, CC_A(_, CC_B(), _), _) => 1 
  case CC_A(_, CC_A(_, CC_C(), _), _) => 2 
  case CC_A(_, CC_B(), _) => 3 
  case CC_A(_, CC_C(), _) => 4 
  case CC_B() => 5 
  case CC_C() => 6 
}
}