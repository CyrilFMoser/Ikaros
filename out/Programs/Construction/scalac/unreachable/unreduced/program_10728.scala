package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: Char, c: (T_A[T_B, Boolean],(Boolean,T_B))) extends T_A[C, T_A[Char, T_A[T_B, T_B]]]
case class CC_B[D]() extends T_A[D, T_A[Char, T_A[T_B, T_B]]]
case class CC_C[E](a: T_A[E, E], b: T_B, c: CC_B[T_B]) extends T_A[E, T_A[Char, T_A[T_B, T_B]]]
case class CC_D(a: (T_A[T_B, T_B],CC_B[T_B]), b: (Boolean,T_A[(Char,Int), T_B])) extends T_B
case class CC_E(a: T_A[T_A[CC_D, (Int,Byte)], CC_B[CC_D]]) extends T_B
case class CC_F(a: Byte, b: CC_C[Boolean]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D((_,CC_B()), (true,_)) => 0 
  case CC_D((_,CC_B()), (false,_)) => 1 
  case CC_E(_) => 2 
  case CC_F(_, _) => 3 
}
}