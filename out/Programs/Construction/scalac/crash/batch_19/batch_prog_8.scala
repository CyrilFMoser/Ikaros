package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[C, C], b: Char) extends T_A[C, D]
case class CC_B[E](a: CC_A[E, E], b: T_A[E, E], c: T_A[E, E]) extends T_A[E, CC_A[T_A[Byte, Char], T_A[Int, Boolean]]]

val v_a: CC_A[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), _) => 0 
}
}