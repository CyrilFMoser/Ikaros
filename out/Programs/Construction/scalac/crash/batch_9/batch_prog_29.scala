package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_B]
case class CC_B(a: T_A[T_B], b: T_B, c: CC_A) extends T_B
case class CC_C(a: CC_A, b: Byte, c: CC_B) extends T_B
case class CC_D(a: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(CC_A(), _, CC_B(_, CC_B(_, _, _), _)) => 1 
  case CC_C(CC_A(), _, CC_B(_, CC_C(_, _, _), _)) => 2 
  case CC_C(CC_A(), _, CC_B(_, CC_D(_), _)) => 3 
  case CC_D(CC_B(CC_A(), CC_B(_, _, _), CC_A())) => 4 
  case CC_D(CC_B(CC_A(), CC_C(_, _, _), CC_A())) => 5 
  case CC_D(CC_B(CC_A(), CC_D(_), CC_A())) => 6 
  case CC_D(CC_C(CC_A(), _, CC_B(_, _, _))) => 7 
  case CC_D(CC_D(CC_C(_, _, _))) => 8 
  case CC_D(CC_D(CC_D(_))) => 9 
}
}
// This is not matched: CC_D(CC_D(CC_B(_, _, _)))