package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D]) extends T_A[D, T_B[Byte]]
case class CC_B[E](a: T_A[E, E], b: T_B[E]) extends T_A[E, T_B[Byte]]
case class CC_C(a: T_A[Byte, T_B[Byte]], b: T_A[CC_A[(Int,Char)], T_B[Byte]]) extends T_A[T_A[T_A[(Char,Boolean), (Char,Int)], T_B[Byte]], T_B[Byte]]
case class CC_D[F, G]() extends T_B[F]
case class CC_E(a: CC_A[CC_C], b: CC_A[CC_D[CC_C, CC_C]]) extends T_B[CC_D[T_B[CC_C], CC_D[CC_C, CC_C]]]
case class CC_F() extends T_B[CC_D[T_B[CC_C], CC_D[CC_C, CC_C]]]

val v_a: T_A[CC_C, T_B[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(CC_D()) => 0 
  case CC_B(_, _) => 1 
}
}