package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Int, Int],T_A[Byte, Byte]), b: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[D, D], b: Char) extends T_A[D, T_A[D, D]]
case class CC_C[E]() extends T_A[E, T_A[E, E]]

val v_a: T_A[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A((_,_), _)) => 0 
  case CC_A(_, CC_B(_, _)) => 1 
  case CC_A(_, CC_C()) => 2 
  case CC_B(_, _) => 3 
  case CC_C() => 4 
}
}