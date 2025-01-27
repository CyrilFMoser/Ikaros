package Program_11 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: T_A[B]) extends T_A[B]
case class CC_B[C](a: CC_A[C], b: (Int,Byte), c: T_A[C]) extends T_A[C]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), CC_B(_, _, _)) => 0 
  case CC_B(_, (12,0), _) => 1 
  case CC_B(CC_A(_, _), (12,0), CC_B(_, _, _)) => 2 
  case CC_B(CC_A(_, _), (_,0), CC_B(_, _, _)) => 3 
}
}
// This is not matched: (CC_B Char Wildcard Wildcard Wildcard (T_A Char))