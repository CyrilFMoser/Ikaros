package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B]]) extends T_A[T_B]
case class CC_B() extends T_A[T_B]
case class CC_C[B](a: CC_B, b: B, c: T_B) extends T_B
case class CC_D(a: CC_C[T_A[(Char,Byte)]], b: T_A[T_B]) extends T_B
case class CC_E() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_B(), _, CC_C(_, _, _)) => 0 
  case CC_C(CC_B(), _, CC_D(_, CC_A(_))) => 1 
  case CC_C(CC_B(), _, CC_D(_, CC_B())) => 2 
  case CC_C(CC_B(), _, CC_E()) => 3 
  case CC_D(CC_C(_, _, CC_C(_, _, _)), CC_A(_)) => 4 
  case CC_D(CC_C(_, _, CC_C(_, _, _)), CC_B()) => 5 
  case CC_D(CC_C(_, _, CC_D(_, _)), CC_A(_)) => 6 
  case CC_D(CC_C(_, _, CC_D(_, _)), CC_B()) => 7 
  case CC_D(CC_C(_, _, CC_E()), CC_A(_)) => 8 
  case CC_D(CC_C(_, _, CC_E()), CC_B()) => 9 
  case CC_E() => 10 
}
}