package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[T_B, C], b: C, c: T_A[C, C]) extends T_A[T_A[T_A[Byte, T_B], (Int,T_B)], C]
case class CC_B(a: Boolean, b: T_B, c: CC_A[T_B]) extends T_A[T_A[T_A[Byte, T_B], (Int,T_B)], Char]
case class CC_C[D, E](a: T_A[E, D]) extends T_A[T_A[T_A[Byte, T_B], (Int,T_B)], D]
case class CC_D(a: (T_A[CC_B, CC_B],CC_B), b: CC_A[T_B]) extends T_B
case class CC_E(a: Int, b: T_B, c: CC_B) extends T_B
case class CC_F(a: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D((_,CC_B(_, _, _)), CC_A(_, _, _)) => 0 
  case CC_E(_, _, CC_B(_, _, _)) => 1 
  case CC_F(CC_D((_,_), CC_A(_, _, _))) => 2 
  case CC_F(CC_E(_, CC_D(_, _), _)) => 3 
  case CC_F(CC_E(_, CC_E(_, _, _), _)) => 4 
  case CC_F(CC_E(_, CC_F(_), _)) => 5 
  case CC_F(CC_F(CC_D(_, _))) => 6 
  case CC_F(CC_F(CC_E(_, _, _))) => 7 
  case CC_F(CC_F(CC_F(_))) => 8 
}
}