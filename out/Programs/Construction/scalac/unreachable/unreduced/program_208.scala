package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: (T_A[Byte, Boolean],T_A[Char, Byte]), c: T_A[Byte, T_A[T_A[Byte, Boolean], T_A[Byte, Boolean]]]) extends T_A[Byte, C]
case class CC_B[E](a: T_A[Byte, E], b: CC_A[E]) extends T_A[Byte, E]

val v_a: T_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_), _) => 0 
  case CC_B(CC_A(_, _, _), _) => 1 
  case CC_B(CC_B(_, _), _) => 2 
}
}