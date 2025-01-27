package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[Int]
case class CC_B(a: T_A[Int], b: T_A[T_B[CC_A]]) extends T_A[Int]
case class CC_C[C, D](a: CC_A, b: T_B[C]) extends T_B[C]
case class CC_D[E](a: E, b: E, c: Char) extends T_B[E]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _) => 1 
  case CC_B(CC_B(_, _), _) => 2 
}
}