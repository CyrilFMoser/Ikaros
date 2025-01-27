package Program_16 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_A,T_B[T_A, Char]), b: T_B[T_A, Boolean]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_B[T_A, CC_B]) extends T_B[T_A, CC_B]
case class CC_D(a: Char, b: T_A) extends T_B[T_A, CC_B]

val v_a: T_B[T_A, CC_B] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_)) => 0 
  case CC_C(CC_D(_, CC_A(_, _))) => 1 
  case CC_C(CC_D(_, CC_B())) => 2 
  case CC_D(_, CC_A(_, _)) => 3 
  case CC_D(_, CC_B()) => 4 
}
}