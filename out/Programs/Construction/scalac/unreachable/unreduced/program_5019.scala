package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: (T_A[T_B, Char],(T_B,T_B))) extends T_A[C, T_B]
case class CC_B[D](a: T_A[D, T_B], b: (T_A[T_B, T_B],T_A[T_B, T_B]), c: T_B) extends T_A[D, T_B]
case class CC_C(a: T_A[T_A[Int, T_B], T_B], b: T_A[CC_A[T_B], CC_B[T_B]], c: T_A[T_A[T_B, T_B], T_A[T_B, T_B]]) extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, _, _), _, _) => 0 
  case CC_D() => 1 
}
}
// This is not matched: CC_C(CC_A(_, (_,_)), _, _)