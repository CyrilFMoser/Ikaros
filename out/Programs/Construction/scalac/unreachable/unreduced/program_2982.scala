package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: (T_A[Int, Int],T_A[Boolean, Boolean])) extends T_A[Boolean, C]
case class CC_B[E](a: CC_A[E, E], b: Byte, c: CC_A[E, E]) extends T_A[Boolean, E]

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A((_,CC_A(_))) => 0 
  case CC_A((_,CC_B(_, _, _))) => 1 
  case CC_B(_, _, _) => 2 
}
}