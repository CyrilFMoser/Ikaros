package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: C, b: T_A[C, T_B], c: T_B) extends T_A[C, T_A[T_A[Byte, T_B], T_A[Char, T_B]]]
case class CC_B[E, F](a: F) extends T_A[E, T_A[T_A[Byte, T_B], T_A[Char, T_B]]]
case class CC_C[G]() extends T_A[G, T_A[T_A[Byte, T_B], T_A[Char, T_B]]]
case class CC_D(a: (T_A[Boolean, T_B],CC_A[T_B, T_B])) extends T_B
case class CC_E() extends T_B
case class CC_F() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D((_,CC_A(_, _, _))) => 0 
  case CC_E() => 1 
  case CC_F() => 2 
}
}