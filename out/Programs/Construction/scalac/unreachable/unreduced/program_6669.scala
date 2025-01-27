package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C]) extends T_A[C, Char]
case class CC_B[D](a: T_A[D, Char], b: D) extends T_A[D, Char]

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_B(CC_A(_, _), _), _) => 1 
  case CC_B(CC_B(CC_B(_, _), _), _) => 2 
}
}
// This is not matched: CC_B(CC_A(_, _), _)