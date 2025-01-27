package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D) extends T_A[Char, D]
case class CC_B(a: T_A[Char, Boolean], b: CC_A[T_A[Int, Char]]) extends T_B[CC_A[T_A[Char, Byte]]]
case class CC_C[E](a: Char, b: T_A[E, E], c: T_B[E]) extends T_B[CC_A[T_A[Char, Byte]]]
case class CC_D(a: T_A[T_A[CC_B, CC_B], T_B[CC_B]], b: T_A[T_B[CC_B], (CC_B,CC_B)]) extends T_B[CC_A[T_A[Char, Byte]]]

val v_a: T_B[CC_A[T_A[Char, Byte]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(true), _) => 0 
  case CC_B(CC_A(false), _) => 1 
  case CC_C(_, _, _) => 2 
  case CC_D(_, _) => 3 
}
}