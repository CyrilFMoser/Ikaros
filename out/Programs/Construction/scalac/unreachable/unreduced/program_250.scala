package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[Char, C]
case class CC_B[D](a: T_A[D, D], b: T_A[D, D]) extends T_A[Char, D]
case class CC_C[E, F](a: Char) extends T_A[E, T_A[Char, E]]

val v_a: T_A[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}