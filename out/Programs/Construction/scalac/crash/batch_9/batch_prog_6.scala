package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, T_A[D, D]]
case class CC_B[E](a: CC_A[E], b: T_A[E, E], c: E) extends T_A[E, T_A[E, E]]
case class CC_C[F]() extends T_A[F, T_A[F, F]]
case class CC_D(a: CC_C[T_B[Byte]]) extends T_B[T_A[CC_A[(Boolean,Byte)], T_A[CC_A[(Boolean,Byte)], CC_A[(Boolean,Byte)]]]]
case class CC_E(a: T_A[CC_C[CC_D], CC_C[CC_D]], b: CC_D) extends T_B[T_A[Char, T_A[Char, Char]]]
case class CC_F(a: CC_E, b: CC_A[CC_B[CC_D]]) extends T_B[T_A[Char, T_A[Char, Char]]]

val v_a: T_A[CC_D, T_A[CC_D, CC_D]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(CC_A(), _, CC_D(_))