package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A(a: Char, b: T_A[Boolean], c: T_A[T_A[Boolean]]) extends T_A[T_A[Boolean]]
case class CC_B(a: T_A[(Char,CC_A)], b: T_A[T_A[Boolean]]) extends T_A[T_A[Boolean]]
case class CC_C(a: Boolean, b: CC_A) extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, CC_A(_, _, CC_A(_, _, _))) => 1 
  case CC_B(_, CC_A(_, _, CC_B(_, _))) => 2 
  case CC_B(_, CC_A(_, _, CC_C(_, _))) => 3 
  case CC_B(_, CC_B(_, CC_A(_, _, _))) => 4 
  case CC_B(_, CC_B(_, CC_B(_, _))) => 5 
  case CC_B(_, CC_B(_, CC_C(_, _))) => 6 
  case CC_B(_, CC_C(true, CC_A(_, _, _))) => 7 
  case CC_B(_, CC_C(false, CC_A(_, _, _))) => 8 
  case CC_C(_, _) => 9 
}
}