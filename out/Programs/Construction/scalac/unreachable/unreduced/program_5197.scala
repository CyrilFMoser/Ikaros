package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Boolean,T_A[Int, Boolean])) extends T_A[Byte, C]
case class CC_B[D](a: Boolean, b: CC_A[Char], c: T_A[Byte, D]) extends T_A[Byte, D]
case class CC_C[E]() extends T_A[Byte, E]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_), CC_A((_,_))) => 0 
  case CC_B(_, CC_A(_), CC_B(_, _, _)) => 1 
  case CC_B(_, CC_A(_), CC_C()) => 2 
}
}