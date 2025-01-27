package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: T_B[T_B[E, E], E], c: E) extends T_A[E, T_A[T_B[(Char,Byte), Boolean], T_B[Int, Boolean]]]
case class CC_B[G, F]() extends T_A[G, F]
case class CC_C[H](a: T_A[H, H]) extends T_B[H, CC_A[CC_B[H, H]]]

val v_a: T_A[Byte, T_A[T_B[(Char,Byte), Boolean], T_B[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}