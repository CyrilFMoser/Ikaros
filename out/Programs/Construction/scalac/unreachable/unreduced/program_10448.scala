package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_B, b: T_B) extends T_A[Char, T_A[Char, T_B]]
case class CC_B(a: T_A[CC_A, T_B]) extends T_A[Char, T_A[Char, T_B]]
case class CC_C(a: CC_B, b: T_B, c: CC_A) extends T_A[Char, T_A[Char, T_B]]

val v_a: T_A[Char, T_A[Char, T_B]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C(CC_B(_), _, CC_A(_, _)) => 2 
}
}