package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Boolean]) extends T_A[C, Boolean]
case class CC_B[D](a: (T_A[Byte, Int],T_A[Byte, Boolean]), b: Char) extends T_A[D, Boolean]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B((_,CC_A(_)), 'x') => 1 
  case CC_B((_,CC_B(_, _)), 'x') => 2 
  case CC_B((_,CC_B(_, _)), _) => 3 
}
}
// This is not matched: CC_B((_,CC_A(_)), _)