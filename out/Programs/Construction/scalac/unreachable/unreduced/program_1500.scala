package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_A[(Int,Char)]]
case class CC_B(a: T_A[T_B], b: T_B) extends T_A[T_A[(Int,Char)]]
case class CC_C(a: CC_B, b: CC_A, c: T_A[T_B]) extends T_A[T_A[(Int,Char)]]
case class CC_D(a: CC_A, b: T_A[CC_A]) extends T_B
case class CC_E() extends T_B
case class CC_F(a: CC_E) extends T_B

val v_a: T_A[T_A[(Int,Char)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_D(_, _)) => 1 
  case CC_B(_, CC_E()) => 2 
  case CC_B(_, CC_F(_)) => 3 
}
}
// This is not matched: CC_C(CC_B(_, _), CC_A(), _)