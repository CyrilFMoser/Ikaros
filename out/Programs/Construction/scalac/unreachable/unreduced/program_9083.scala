package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_B[E, E], b: T_B[E, E], c: T_A[E, E]) extends T_A[E, F]
case class CC_B(a: Char, b: T_A[Int, (Char,Boolean)], c: T_B[Char, T_A[Byte, Char]]) extends T_A[(T_B[Char, (Char,Byte)],T_A[Byte, Boolean]), T_B[T_A[Char, Int], T_A[(Boolean,Int), Int]]]
case class CC_C(a: T_B[CC_A[CC_B, CC_B], T_B[Byte, CC_B]], b: CC_A[Boolean, CC_A[CC_B, Boolean]]) extends T_B[CC_B, T_A[CC_B, T_A[CC_B, CC_B]]]
case class CC_D() extends T_B[CC_B, T_A[CC_B, T_A[CC_B, CC_B]]]
case class CC_E(a: T_A[T_A[Byte, CC_B], Boolean], b: Int) extends T_B[CC_B, T_A[CC_B, T_A[CC_B, CC_B]]]

val v_a: T_B[CC_B, T_A[CC_B, T_A[CC_B, CC_B]]] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_, _, _)) => 0 
  case CC_E(_, _) => 1 
}
}
// This is not matched: CC_D()