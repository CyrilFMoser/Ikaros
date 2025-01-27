package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_B[Boolean, Boolean]) extends T_A[T_B[Boolean, T_B[Byte, Char]], Boolean]
case class CC_B(a: T_B[CC_A, T_A[(Byte,Int), (Char,Int)]], b: T_A[Char, CC_A], c: T_A[Boolean, (Char,CC_A)]) extends T_A[T_B[Boolean, T_B[Byte, Char]], Boolean]
case class CC_C() extends T_A[T_B[Boolean, T_B[Byte, Char]], Boolean]
case class CC_D[E](a: E, b: CC_C, c: E) extends T_B[T_B[CC_B, T_B[CC_C, CC_B]], E]
case class CC_E[F](a: CC_D[F], b: (CC_B,Int)) extends T_B[T_B[CC_B, T_B[CC_C, CC_B]], F]
case class CC_F[G](a: Byte, b: (CC_E[CC_C],CC_E[CC_C])) extends T_B[T_B[CC_B, T_B[CC_C, CC_B]], G]

val v_a: T_B[T_B[CC_B, T_B[CC_C, CC_B]], CC_C] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_C(), CC_C()) => 0 
  case CC_E(CC_D(_, _, CC_C()), (CC_B(_, _, _),12)) => 1 
  case CC_E(CC_D(_, _, CC_C()), (CC_B(_, _, _),_)) => 2 
  case CC_F(_, (CC_E(_, _),CC_E(_, _))) => 3 
}
}