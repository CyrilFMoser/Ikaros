package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: T_B) extends T_A[C, T_B]
case class CC_B[D](a: D, b: (T_B,Int)) extends T_A[D, T_B]
case class CC_C[E](a: Int, b: (T_A[Char, T_B],T_A[T_B, Boolean])) extends T_A[Char, T_B]
case class CC_D(a: T_A[T_A[T_B, T_B], T_B], b: T_A[Char, T_B], c: CC_B[Boolean]) extends T_B

val v_a: T_A[Char, T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, (_,_)) => 1 
}
}
// This is not matched: CC_C(_, (_,_))