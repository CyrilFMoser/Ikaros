package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[T_A[C, C], C], b: T_A[C, T_B]) extends T_A[T_A[C, C], C]
case class CC_B[D](a: T_A[D, D], b: T_A[D, T_B]) extends T_A[D, T_B]
case class CC_C[E](a: (T_A[T_B, T_B],(T_B,T_B)), b: E) extends T_A[E, T_B]
case class CC_D(a: T_A[T_A[T_B, Byte], T_B], b: (T_A[Char, T_B],T_A[T_B, T_B]), c: Char) extends T_B
case class CC_E(a: (CC_D,(T_B,T_B))) extends T_B
case class CC_F(a: Boolean, b: CC_A[CC_D]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_B(_, _), _, _) => 0 
  case CC_E((_,_)) => 1 
  case CC_F(_, CC_A(_, _)) => 2 
}
}
// This is not matched: CC_D(CC_C(_, _), _, _)