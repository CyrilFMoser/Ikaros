package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, T_B]
case class CC_B(a: CC_A[T_A[T_B, Boolean]], b: T_B, c: T_A[T_A[T_B, T_B], T_A[T_B, T_B]]) extends T_B
case class CC_C(a: (Int,T_A[(Boolean,Byte), T_B]), b: Char) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(CC_A(), _, _), _) => 0 
  case CC_C((_,CC_A()), 'x') => 1 
  case CC_C((_,CC_A()), _) => 2 
}
}
// This is not matched: CC_B(_, CC_C((_,_), _), _)