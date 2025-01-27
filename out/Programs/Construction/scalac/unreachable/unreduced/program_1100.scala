package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: T_A[T_B, C], c: T_B) extends T_A[T_B, C]
case class CC_B(a: (T_B,CC_A[T_B]), b: T_A[T_A[Char, T_B], T_A[Char, T_B]], c: CC_A[T_A[T_B, T_B]]) extends T_A[T_B, Byte]

val v_a: T_A[T_B, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_B(_, _, _), _) => 1 
  case CC_B((_,_), _, _) => 2 
}
}