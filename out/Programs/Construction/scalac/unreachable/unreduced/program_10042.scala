package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[Char], b: T_A[Char], c: T_B[T_A[Char], T_A[Char]]) extends T_A[Char]
case class CC_B(a: T_A[T_B[CC_A, CC_A]]) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), _, _) => 0 
  case CC_A(CC_A(CC_B(_), CC_A(_, _, _), _), _, _) => 1 
  case CC_A(CC_A(CC_A(_, _, _), CC_B(_), _), _, _) => 2 
  case CC_A(CC_A(CC_B(_), CC_B(_), _), _, _) => 3 
  case CC_B(_) => 4 
}
}
// This is not matched: CC_A(CC_B(_), _, _)