package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: C, b: T_B, c: T_B) extends T_A[Byte, C]
case class CC_B[E](a: Boolean, b: T_A[E, E], c: T_A[T_A[E, E], E]) extends T_A[T_A[E, E], E]
case class CC_C(a: (CC_A[T_B, T_B],CC_A[T_B, T_B])) extends T_A[T_A[T_A[Byte, T_B], T_A[Byte, T_B]], T_A[Byte, T_B]]
case class CC_D(a: T_A[Byte, T_A[Byte, CC_C]], b: CC_A[Char, Int]) extends T_B
case class CC_E(a: T_A[Byte, CC_B[(Int,Int)]], b: T_A[T_A[(CC_C,T_B), (CC_C,T_B)], (CC_C,T_B)], c: T_A[Char, CC_A[CC_D, CC_D]]) extends T_B
case class CC_F() extends T_B

val v_a: T_A[T_A[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_B(true, CC_A(_, _, CC_D(_, _)), CC_B(true, CC_A(_, _, _), CC_B(_, _, _))) => 0 
  case CC_B(true, CC_A(_, _, CC_D(_, _)), CC_B(false, CC_A(_, _, _), CC_B(_, _, _))) => 1 
  case CC_B(false, CC_A(_, _, CC_D(_, _)), CC_B(true, CC_A(_, _, _), CC_B(_, _, _))) => 2 
  case CC_B(false, CC_A(_, _, CC_D(_, _)), CC_B(false, CC_A(_, _, _), CC_B(_, _, _))) => 3 
  case CC_B(true, CC_A(_, _, CC_E(_, _, _)), CC_B(true, CC_A(_, _, _), CC_B(_, _, _))) => 4 
  case CC_B(true, CC_A(_, _, CC_E(_, _, _)), CC_B(false, CC_A(_, _, _), CC_B(_, _, _))) => 5 
  case CC_B(false, CC_A(_, _, CC_E(_, _, _)), CC_B(true, CC_A(_, _, _), CC_B(_, _, _))) => 6 
  case CC_B(false, CC_A(_, _, CC_E(_, _, _)), CC_B(false, CC_A(_, _, _), CC_B(_, _, _))) => 7 
  case CC_B(true, CC_A(_, _, CC_F()), CC_B(true, CC_A(_, _, _), CC_B(_, _, _))) => 8 
  case CC_B(true, CC_A(_, _, CC_F()), CC_B(false, CC_A(_, _, _), CC_B(_, _, _))) => 9 
  case CC_B(false, CC_A(_, _, CC_F()), CC_B(true, CC_A(_, _, _), CC_B(_, _, _))) => 10 
  case CC_B(false, CC_A(_, _, CC_F()), CC_B(false, CC_A(_, _, _), CC_B(_, _, _))) => 11 
}
}