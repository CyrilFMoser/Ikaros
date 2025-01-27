package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_A[Boolean], c: T_B) extends T_A[T_A[T_A[T_B]]]
case class CC_B(a: Char, b: T_A[CC_A], c: Boolean) extends T_B
case class CC_C() extends T_B
case class CC_D(a: CC_B, b: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _, true) => 0 
  case CC_B(_, _, false) => 1 
  case CC_C() => 2 
  case CC_D(_, CC_B(_, _, _)) => 3 
  case CC_D(_, CC_C()) => 4 
  case CC_D(_, CC_D(_, CC_B(_, _, _))) => 5 
  case CC_D(_, CC_D(_, CC_C())) => 6 
  case CC_D(_, CC_D(_, CC_D(_, _))) => 7 
}
}