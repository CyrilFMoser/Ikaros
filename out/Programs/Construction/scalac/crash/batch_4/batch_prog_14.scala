package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: T_A[T_A[D, E], T_A[C, C]]) extends T_A[C, D]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}