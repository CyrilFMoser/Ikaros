package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C], b: T_A[C], c: T_A[C]) extends T_A[C]
case class CC_B[D](a: Boolean) extends T_A[D]
case class CC_C[E, F](a: F) extends T_A[E]
case class CC_D(a: T_A[CC_A[Boolean]], b: CC_B[Char], c: T_A[T_A[Int]]) extends T_B[T_A[T_A[Char]]]

val v_a: T_A[CC_D] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), _) => 0 
  case CC_A(_, CC_A(_, CC_B(_), CC_A(_, _, _)), _) => 1 
  case CC_A(_, CC_A(_, CC_C(_), CC_A(_, _, _)), _) => 2 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_B(_)), _) => 3 
  case CC_A(_, CC_A(_, CC_B(_), CC_B(_)), _) => 4 
  case CC_A(_, CC_A(_, CC_C(_), CC_B(_)), _) => 5 
  case CC_A(_, CC_A(_, CC_B(_), CC_C(_)), _) => 6 
  case CC_A(_, CC_A(_, CC_C(_), CC_C(_)), _) => 7 
  case CC_A(_, CC_B(_), _) => 8 
  case CC_A(_, CC_C(_), _) => 9 
  case CC_B(_) => 10 
  case CC_C(_) => 11 
}
}
// This is not matched: CC_A(_, CC_A(_, CC_A(_, _, _), CC_C(_)), _)