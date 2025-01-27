package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D](a: Char) extends T_A[D]
case class CC_C[E](a: Int, b: CC_B[E], c: T_B[E]) extends T_B[E]
case class CC_D(a: CC_B[Int]) extends T_B[CC_A[T_A[Char]]]
case class CC_E() extends T_B[CC_A[T_A[Char]]]

val v_a: CC_E = null
val v_b: Int = v_a match{
  case CC_E() => 0 
}
}