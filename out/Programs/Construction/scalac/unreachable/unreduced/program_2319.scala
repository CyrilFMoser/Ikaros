package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: ((Int,(Char,Boolean)),Int), b: T_A[C], c: T_B[C]) extends T_A[C]
case class CC_B[D]() extends T_A[D]
case class CC_C[E](a: Char, b: T_A[E], c: Boolean) extends T_A[E]
case class CC_D(a: T_A[CC_B[Boolean]], b: Boolean, c: CC_C[CC_A[Boolean]]) extends T_B[T_A[T_A[Int]]]
case class CC_E(a: Char) extends T_B[T_A[T_A[Int]]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _, _), _), _) => 0 
  case CC_A(_, CC_A(_, CC_B(), _), _) => 1 
  case CC_A(_, CC_A(_, CC_C(_, _, _), _), _) => 2 
  case CC_A(_, CC_B(), _) => 3 
  case CC_A(_, CC_C(_, CC_A(_, _, _), _), _) => 4 
  case CC_A(_, CC_C(_, CC_B(), _), _) => 5 
  case CC_A(_, CC_C(_, CC_C(_, _, _), _), _) => 6 
  case CC_B() => 7 
  case CC_C(_, CC_A(_, _, _), true) => 8 
  case CC_C(_, CC_B(), true) => 9 
  case CC_C(_, CC_C(_, _, _), true) => 10 
  case CC_C(_, CC_A(_, _, _), false) => 11 
  case CC_C(_, CC_B(), false) => 12 
  case CC_C(_, CC_C(_, _, _), false) => 13 
}
}