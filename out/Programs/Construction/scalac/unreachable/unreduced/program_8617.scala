package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C], b: T_A[C, C], c: T_A[T_A[C, C], C]) extends T_A[T_A[C, C], C]
case class CC_B[D](a: Int) extends T_A[T_A[Char, Char], Char]

val v_a: T_A[T_A[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, CC_A(CC_A(_, _, _), _, _)) => 0 
  case CC_A(CC_A(_, _, _), _, CC_A(CC_B(_), _, _)) => 1 
  case CC_A(CC_A(_, _, _), _, CC_B(_)) => 2 
  case CC_A(CC_B(_), _, CC_A(CC_A(_, _, _), _, _)) => 3 
  case CC_A(CC_B(_), _, CC_A(CC_B(_), _, _)) => 4 
  case CC_A(CC_B(_), _, CC_B(_)) => 5 
  case CC_B(_) => 6 
}
}