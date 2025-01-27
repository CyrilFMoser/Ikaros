package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[(Boolean,Char)], b: T_A[C], c: T_A[C]) extends T_A[C]
case class CC_B[D](a: CC_A[D], b: Boolean, c: T_B[D]) extends T_A[D]
case class CC_C[E]() extends T_A[E]
case class CC_D(a: T_A[T_B[Byte]]) extends T_B[T_A[T_B[Boolean]]]
case class CC_E(a: CC_A[CC_C[CC_D]], b: T_A[CC_B[CC_D]], c: T_B[T_A[CC_D]]) extends T_B[T_A[T_B[Boolean]]]

val v_a: T_B[T_A[T_B[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, CC_A(_, _, _), CC_A(_, _, _))) => 0 
  case CC_D(CC_A(_, CC_B(_, _, _), CC_A(_, _, _))) => 1 
  case CC_D(CC_A(_, CC_C(), CC_A(_, _, _))) => 2 
  case CC_D(CC_A(_, CC_A(_, _, _), CC_B(_, _, _))) => 3 
  case CC_D(CC_A(_, CC_B(_, _, _), CC_B(_, _, _))) => 4 
  case CC_D(CC_A(_, CC_C(), CC_B(_, _, _))) => 5 
  case CC_D(CC_A(_, CC_A(_, _, _), CC_C())) => 6 
  case CC_D(CC_A(_, CC_B(_, _, _), CC_C())) => 7 
  case CC_D(CC_A(_, CC_C(), CC_C())) => 8 
  case CC_D(CC_B(CC_A(_, _, _), _, _)) => 9 
  case CC_D(CC_C()) => 10 
  case CC_E(_, CC_A(_, _, _), _) => 11 
  case CC_E(_, CC_B(_, _, _), _) => 12 
  case CC_E(_, CC_C(), _) => 13 
}
}