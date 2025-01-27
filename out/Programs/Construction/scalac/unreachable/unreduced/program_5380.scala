package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], Char], b: T_A[Byte, T_A[Byte, T_A[(Boolean,Boolean), Byte]]], c: (Boolean,T_A[Byte, (Boolean,Byte)])) extends T_A[Byte, C]
case class CC_B[E](a: E, b: Boolean, c: E) extends T_A[Byte, E]

val v_a: T_A[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _, _), _), _) => 0 
  case CC_A(_, CC_A(_, CC_B(_, _, _), _), _) => 1 
  case CC_A(_, CC_B(_, _, _), _) => 2 
  case CC_B(_, _, _) => 3 
}
}