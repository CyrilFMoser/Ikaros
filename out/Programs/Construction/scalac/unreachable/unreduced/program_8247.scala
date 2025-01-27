package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: Char, c: T_A[Boolean]) extends T_A[T_B]
case class CC_B() extends T_A[T_B]
case class CC_C[B](a: B, b: T_A[T_B]) extends T_B
case class CC_D(a: Char, b: T_A[(CC_A,CC_B)], c: T_B) extends T_B
case class CC_E(a: Int, b: T_A[Boolean]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(_, _, CC_C(_, CC_A(_, _, _))) => 1 
  case CC_D(_, _, CC_D(_, _, CC_C(_, _))) => 2 
  case CC_D(_, _, CC_D(_, _, CC_D(_, _, _))) => 3 
  case CC_D(_, _, CC_D(_, _, CC_E(_, _))) => 4 
  case CC_D(_, _, CC_E(_, _)) => 5 
  case CC_E(_, _) => 6 
}
}
// This is not matched: CC_D(_, _, CC_C(_, CC_B()))