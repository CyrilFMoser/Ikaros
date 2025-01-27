package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[T_B[D], D]
case class CC_B(a: T_A[T_B[Boolean], T_B[Char]], b: Char) extends T_B[T_A[CC_A[Char], T_A[Boolean, Int]]]
case class CC_C[E](a: Int, b: CC_A[E]) extends T_B[T_A[CC_A[Char], T_A[Boolean, Int]]]

val v_a: T_B[T_A[CC_A[Char], T_A[Boolean, Int]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_, _) => 1 
}
}