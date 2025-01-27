package Program_20 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]], b: Char, c: T_A[Boolean]) extends T_A[Boolean]
case class CC_B(a: T_A[T_A[Boolean]], b: CC_A, c: T_A[(CC_A,CC_A)]) extends T_A[Boolean]
case class CC_C() extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, CC_A(_, _, _))) => 0 
  case CC_A(_, _, CC_A(_, _, CC_B(_, _, _))) => 1 
  case CC_A(_, _, CC_A(_, _, CC_C())) => 2 
  case CC_A(_, _, CC_B(_, _, _)) => 3 
  case CC_A(_, _, CC_C()) => 4 
  case CC_B(_, CC_A(_, 'x', _), _) => 5 
  case CC_B(_, CC_A(_, _, _), _) => 6 
  case CC_C() => 7 
}
}