package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E]() extends T_A[D, E]
case class CC_B[F](a: F, b: F) extends T_A[F, T_A[F, F]]
case class CC_C(a: CC_A[Char, T_B[Byte]], b: T_B[CC_A[Boolean, Char]]) extends T_A[T_A[T_B[(Byte,Byte)], T_A[T_B[(Byte,Byte)], T_B[(Byte,Byte)]]], T_A[T_A[T_B[(Byte,Byte)], T_A[T_B[(Byte,Byte)], T_B[(Byte,Byte)]]], T_A[T_B[(Byte,Byte)], T_A[T_B[(Byte,Byte)], T_B[(Byte,Byte)]]]]]
case class CC_D() extends T_B[CC_B[CC_B[CC_C]]]
case class CC_E(a: T_A[(Char,CC_D), CC_C]) extends T_B[CC_B[CC_B[CC_C]]]
case class CC_F(a: T_A[CC_E, CC_A[Boolean, CC_D]], b: Int, c: T_B[T_B[CC_D]]) extends T_B[CC_B[CC_B[CC_C]]]

val v_a: T_B[CC_B[CC_B[CC_C]]] = null
val v_b: Int = v_a match{
  case CC_E(CC_A()) => 0 
  case CC_F(CC_A(), 12, _) => 1 
  case CC_F(CC_A(), _, _) => 2 
}
}
// This is not matched: CC_D()