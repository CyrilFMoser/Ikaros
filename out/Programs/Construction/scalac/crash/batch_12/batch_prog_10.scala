package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: T_B[D], b: T_B[E], c: T_A[E, (Byte,(Int,Boolean))]) extends T_A[D, E]

val v_a: CC_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
}
}