package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[T_A[D, C], T_A[C, D]], b: T_A[D, Byte]) extends T_A[C, D]

val v_a: CC_A[Char, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}