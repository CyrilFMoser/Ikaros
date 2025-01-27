package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: (Boolean,T_A[T_B, T_B]), b: (Boolean,T_A[T_B, Char]), c: (T_A[(Int,Byte), T_B],T_B)) extends T_A[C, T_B]
case class CC_B[D](a: (T_A[T_B, T_B],CC_A[T_B]), b: T_A[D, T_B]) extends T_A[D, T_B]
case class CC_C[E](a: CC_B[E], b: E, c: T_B) extends T_A[E, T_B]
case class CC_D(a: T_A[CC_A[T_B], T_B], b: T_A[T_A[T_B, T_B], CC_B[T_B]], c: Boolean) extends T_B
case class CC_E() extends T_B
case class CC_F(a: CC_E, b: CC_E) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E() => 1 
}
}
// This is not matched: CC_F(_, _)