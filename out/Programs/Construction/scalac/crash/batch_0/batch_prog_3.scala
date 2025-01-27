package Program_3 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: T_A[B], c: T_A[B]) extends T_A[B]
case class CC_B[C](a: T_A[C]) extends T_A[C]
case class CC_C[D](a: CC_B[D]) extends T_A[D]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(CC_A(_, _, _), _, CC_A(_, _, _)), _) => 0 
  case CC_A(_, CC_A(CC_B(_), _, CC_A(_, _, _)), _) => 1 
  case CC_A(_, CC_A(CC_C(_), _, CC_A(_, _, _)), _) => 2 
  case CC_A(_, CC_A(CC_A(_, _, _), _, CC_B(_)), _) => 3 
  case CC_A(_, CC_A(CC_B(_), _, CC_B(_)), _) => 4 
  case CC_A(_, CC_A(CC_C(_), _, CC_B(_)), _) => 5 
  case CC_A(_, CC_A(CC_A(_, _, _), _, CC_C(_)), _) => 6 
  case CC_A(_, CC_A(CC_B(_), _, CC_C(_)), _) => 7 
  case CC_A(_, CC_A(CC_C(_), _, CC_C(_)), _) => 8 
  case CC_A(_, CC_B(CC_A(_, _, _)), _) => 9 
  case CC_A(_, CC_B(CC_B(_)), _) => 10 
  case CC_A(_, CC_B(CC_C(_)), _) => 11 
  case CC_A(_, CC_C(_), _) => 12 
  case CC_B(_) => 13 
  case CC_C(CC_B(CC_A(_, _, _))) => 14 
  case CC_C(CC_B(CC_B(_))) => 15 
  case CC_C(CC_B(CC_C(_))) => 16 
}
}