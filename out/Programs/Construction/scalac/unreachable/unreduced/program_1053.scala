package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Byte) extends T_A[C, Char]
case class CC_B[D](a: CC_A[D], b: T_A[D, D]) extends T_A[D, Char]
case class CC_C(a: T_A[T_A[Boolean, Char], Char]) extends T_A[CC_B[CC_B[Char]], Char]

val v_a: T_A[CC_B[CC_B[Char]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), _) => 1 
  case CC_C(CC_A(_)) => 2 
  case CC_C(CC_B(_, _)) => 3 
}
}