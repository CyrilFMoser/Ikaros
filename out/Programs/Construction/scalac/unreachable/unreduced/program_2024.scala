package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: T_B[C]) extends T_A[C]
case class CC_B[D](a: T_A[D], b: D, c: D) extends T_A[D]
case class CC_C(a: Char, b: Char) extends T_B[T_A[CC_B[Char]]]
case class CC_D(a: CC_A[CC_B[CC_C]]) extends T_B[T_A[CC_B[Char]]]
case class CC_E[E](a: T_B[E]) extends T_B[T_A[CC_B[Char]]]

val v_a: T_B[T_A[CC_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(CC_A(_, _)) => 1 
  case CC_E(_) => 2 
}
}