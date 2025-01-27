package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D]() extends T_A[D]
case class CC_C[E](a: E, b: T_A[E], c: T_A[E]) extends T_A[E]
case class CC_D(a: T_A[CC_C[Boolean]], b: T_A[T_A[(Boolean,Boolean)]], c: T_A[(Byte,(Byte,Int))]) extends T_B[CC_A[T_B[Byte]]]
case class CC_E() extends T_B[CC_A[T_B[Byte]]]
case class CC_F(a: T_B[CC_C[CC_D]]) extends T_B[CC_A[T_B[Byte]]]

val v_a: T_B[CC_A[T_B[Byte]]] = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_F(_) => 1 
}
}
// This is not matched: CC_E()