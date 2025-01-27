package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: T_A[T_A[Byte, Byte], T_A[T_A[Byte, Byte], T_A[Byte, Byte]]]) extends T_A[C, T_A[C, C]]
case class CC_B(a: Boolean) extends T_A[(T_A[(Boolean,Boolean), Char],CC_A[Char]), T_A[(T_A[(Boolean,Boolean), Char],CC_A[Char]), (T_A[(Boolean,Boolean), Char],CC_A[Char])]]
case class CC_C[E](a: (Int,Int), b: T_A[E, T_A[E, E]], c: CC_A[E]) extends T_A[E, T_A[E, E]]

val v_a: T_A[CC_B, T_A[CC_B, CC_B]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(_, _, _) => 1 
}
}