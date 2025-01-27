package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[T_A[C, C], C], b: C, c: T_A[D, D]) extends T_A[D, C]
case class CC_B[E](a: (CC_A[Byte, Byte],T_A[Byte, Byte]), b: E) extends T_A[E, T_A[E, E]]

val v_a: CC_A[Char, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
}
}