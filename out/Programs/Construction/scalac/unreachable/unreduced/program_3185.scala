package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[Int, C], b: T_A[Int, C], c: T_A[Int, C]) extends T_A[Int, C]
case class CC_B[D](a: T_A[D, D], b: D, c: CC_A[D]) extends T_A[Int, D]
case class CC_C[E](a: E, b: Boolean, c: T_A[Int, E]) extends T_A[Int, E]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(CC_A(_, _, _), _, _), _) => 0 
  case CC_A(_, CC_A(CC_B(_, _, _), _, _), _) => 1 
  case CC_A(_, CC_A(CC_C(_, _, _), _, _), _) => 2 
  case CC_A(_, CC_B(_, _, _), _) => 3 
  case CC_A(_, CC_C(_, true, CC_A(_, _, _)), _) => 4 
  case CC_A(_, CC_C(_, false, CC_A(_, _, _)), _) => 5 
  case CC_A(_, CC_C(_, true, CC_B(_, _, _)), _) => 6 
  case CC_A(_, CC_C(_, false, CC_B(_, _, _)), _) => 7 
  case CC_A(_, CC_C(_, true, CC_C(_, _, _)), _) => 8 
  case CC_A(_, CC_C(_, false, CC_C(_, _, _)), _) => 9 
  case CC_B(_, _, _) => 10 
  case CC_C(_, _, CC_A(_, _, _)) => 11 
  case CC_C(_, _, CC_B(_, _, _)) => 12 
  case CC_C(_, _, CC_C(_, _, CC_A(_, _, _))) => 13 
  case CC_C(_, _, CC_C(_, _, CC_B(_, _, _))) => 14 
  case CC_C(_, _, CC_C(_, _, CC_C(_, _, _))) => 15 
}
}