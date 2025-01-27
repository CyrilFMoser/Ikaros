package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: T_A[B], b: T_A[B], c: T_A[B]) extends T_A[B]
case class CC_B(a: T_B, b: T_B) extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), CC_B(_, _), CC_A(_, _, _)) => 0 
  case CC_A(CC_A(_, _, _), _, CC_A(_, _, _)) => 1 
  case CC_A(CC_A(_, _, _), _, _) => 2 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), _) => 3 
  case CC_A(CC_B(_, _), CC_A(_, _, _), CC_A(_, _, _)) => 4 
  case CC_A(CC_A(_, _, _), CC_B(_, _), _) => 5 
}
}
// This is not matched: (CC_B Wildcard Wildcard (T_A Byte))