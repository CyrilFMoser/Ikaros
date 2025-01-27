package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Char) extends T_A[T_A[T_A[Int, Char], Boolean], D]
case class CC_B[E](a: Byte, b: E, c: CC_A[E]) extends T_A[T_A[T_A[Int, Char], Boolean], E]
case class CC_C(a: T_B[T_A[Byte, Byte]]) extends T_B[T_A[CC_A[(Int,Boolean)], CC_B[Int]]]
case class CC_D(a: CC_A[T_A[CC_C, CC_C]]) extends T_B[T_A[CC_A[(Int,Boolean)], CC_B[Int]]]

val v_a: T_B[T_A[CC_A[(Int,Boolean)], CC_B[Int]]] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(CC_A(_)) => 1 
}
}