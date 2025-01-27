package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[C, T_A[T_A[Char, Char], T_A[(Boolean,Char), Byte]]]
case class CC_B[E](a: T_A[E, E], b: Boolean, c: T_A[E, E]) extends T_A[E, T_A[T_A[Char, Char], T_A[(Boolean,Char), Byte]]]
case class CC_C[F](a: CC_B[F], b: Boolean) extends T_A[F, T_A[T_A[Char, Char], T_A[(Boolean,Char), Byte]]]

val v_a: T_A[Byte, T_A[T_A[Char, Char], T_A[(Boolean,Char), Byte]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_, true) => 1 
  case CC_C(_, false) => 2 
}
}
// This is not matched: CC_A()