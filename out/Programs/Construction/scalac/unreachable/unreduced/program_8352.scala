package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, T_A[D, D]]
case class CC_B[E](a: T_A[T_B[E], E], b: Int) extends T_A[E, T_A[E, E]]
case class CC_C(a: T_B[CC_B[Boolean]]) extends T_B[T_A[Boolean, T_A[Int, Byte]]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}