package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, T_A[C, T_A[C, C]]]
case class CC_B(a: T_A[T_B, T_A[T_B, (Int,Boolean)]], b: T_B) extends T_B
case class CC_C(a: T_B) extends T_B
case class CC_D(a: CC_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, CC_B(_, _))) => 0 
  case CC_B(_, CC_B(_, CC_C(_))) => 1 
  case CC_B(_, CC_B(_, CC_D(_))) => 2 
  case CC_B(_, CC_C(CC_B(_, _))) => 3 
  case CC_B(_, CC_C(CC_C(_))) => 4 
  case CC_B(_, CC_C(CC_D(_))) => 5 
  case CC_B(_, CC_D(CC_B(_, _))) => 6 
  case CC_C(CC_B(_, _)) => 7 
  case CC_C(CC_C(CC_B(_, _))) => 8 
  case CC_C(CC_C(CC_C(_))) => 9 
  case CC_C(CC_C(CC_D(_))) => 10 
  case CC_C(CC_D(CC_B(_, _))) => 11 
  case CC_D(_) => 12 
}
}