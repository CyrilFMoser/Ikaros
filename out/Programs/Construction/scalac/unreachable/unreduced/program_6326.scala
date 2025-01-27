package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_B, c: T_A[C, C]) extends T_A[C, (T_A[Boolean, T_B],T_B)]
case class CC_B(a: T_B, b: Char) extends T_A[T_B, (T_A[Boolean, T_B],T_B)]
case class CC_C[D](a: CC_A[D], b: T_A[D, CC_B], c: T_B) extends T_A[D, (T_A[Boolean, T_B],T_B)]
case class CC_D(a: CC_A[T_A[CC_B, T_B]]) extends T_B
case class CC_E[E]() extends T_B
case class CC_F(a: (T_B,CC_B)) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_A(CC_D(_), CC_D(_), _)) => 0 
  case CC_D(CC_A(CC_E(), CC_D(_), _)) => 1 
  case CC_D(CC_A(CC_F(_), CC_D(_), _)) => 2 
  case CC_D(CC_A(CC_E(), CC_E(), _)) => 3 
  case CC_D(CC_A(CC_F(_), CC_E(), _)) => 4 
  case CC_D(CC_A(CC_D(_), CC_F(_), _)) => 5 
  case CC_D(CC_A(CC_E(), CC_F(_), _)) => 6 
  case CC_D(CC_A(CC_F(_), CC_F(_), _)) => 7 
  case CC_E() => 8 
  case CC_F((CC_D(_),CC_B(_, _))) => 9 
  case CC_F((CC_E(),CC_B(_, _))) => 10 
  case CC_F((CC_F(_),CC_B(_, _))) => 11 
}
}
// This is not matched: CC_D(CC_A(CC_D(_), CC_E(), _))