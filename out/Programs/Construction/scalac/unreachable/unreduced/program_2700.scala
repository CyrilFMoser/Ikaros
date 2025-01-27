package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: D, b: T_A[D, T_A[T_B[D], T_B[D]]]) extends T_A[E, D]
case class CC_B[G, H](a: T_B[G], b: T_B[G], c: T_A[T_A[Char, Char], G]) extends T_A[G, H]
case class CC_C() extends T_B[Int]

val v_a: CC_B[Int, CC_C] = null
val v_b: Int = v_a match{
  case CC_B(CC_C(), _, CC_A(_, _)) => 0 
  case CC_B(CC_C(), _, CC_B(_, _, _)) => 1 
}
}