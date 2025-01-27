package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: T_A[C, T_A[T_B, Boolean]]) extends T_A[C, T_A[T_B, Boolean]]
case class CC_B(a: T_A[T_A[T_B, T_B], T_A[T_B, Boolean]], b: T_A[(T_B,T_B), CC_A[T_B]]) extends T_B
case class CC_C(a: Char, b: (T_B,T_B), c: CC_B) extends T_B
case class CC_D(a: Char, b: (T_B,CC_C), c: T_B) extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(_, (_,_), CC_B(_, _)) => 0 
  case CC_D(_, (_,_), CC_D(_, _, _)) => 1 
}
}
// This is not matched: CC_D(_, (_,_), CC_C(_, _, _))