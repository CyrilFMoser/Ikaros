package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: T_B[E, E], c: Byte) extends T_A[E, (T_B[Boolean, Byte],T_B[Boolean, Byte])]
case class CC_B() extends T_A[CC_A[T_A[(Boolean,Int), Char]], (T_B[Boolean, Byte],T_B[Boolean, Byte])]
case class CC_C(a: Boolean, b: T_A[T_B[CC_B, CC_B], T_B[(Byte,Char), CC_B]]) extends T_A[CC_A[T_A[(Boolean,Int), Char]], (T_B[Boolean, Byte],T_B[Boolean, Byte])]
case class CC_D[G, F](a: CC_A[G]) extends T_B[G, F]
case class CC_E[I, H](a: I) extends T_B[H, I]

val v_a: T_A[CC_A[T_A[(Boolean,Int), Char]], (T_B[Boolean, Byte],T_B[Boolean, Byte])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_B()