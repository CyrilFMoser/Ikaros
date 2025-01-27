package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: (T_B,T_A[Int, (Byte,Int)]), b: (T_A[T_B, T_B],T_B)) extends T_A[C, T_A[C, C]]
case class CC_B[D]() extends T_A[D, T_A[D, D]]
case class CC_C[E](a: E, b: T_A[E, T_A[E, E]]) extends T_A[E, T_A[E, E]]
case class CC_D(a: T_A[CC_C[(Int,Int)], T_A[CC_C[(Int,Int)], CC_C[(Int,Int)]]]) extends T_B
case class CC_E(a: (CC_A[CC_D],T_B), b: CC_A[CC_D]) extends T_B
case class CC_F(a: Int, b: (T_B,(CC_E,CC_D))) extends T_B

val v_a: T_A[CC_E, T_A[CC_E, CC_E]] = null
val v_b: Int = v_a match{
  case CC_A((CC_D(_),_), _) => 0 
  case CC_A((CC_E(_, _),_), _) => 1 
  case CC_A((CC_F(_, _),_), _) => 2 
  case CC_B() => 3 
  case CC_C(CC_E(_, _), CC_A(_, _)) => 4 
  case CC_C(CC_E(_, _), CC_B()) => 5 
  case CC_C(CC_E(_, _), CC_C(CC_E(_, _), CC_A(_, _))) => 6 
  case CC_C(CC_E(_, _), CC_C(CC_E(_, _), CC_B())) => 7 
  case CC_C(CC_E(_, _), CC_C(CC_E(_, _), CC_C(_, _))) => 8 
}
}