package Program_8 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: Byte) extends T_A[B]
case class CC_B[D](a: T_A[CC_A[D, D]], b: CC_A[D, D]) extends T_A[D]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), CC_A(_)) => 1 
  case CC_B(CC_B(CC_A(_), CC_A(_)), CC_A(_)) => 2 
}
}
// This is not matched: CC_B(CC_B(CC_B(_, _), CC_A(_)), CC_A(_))