package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Byte, Boolean],T_A[Char, Int])) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: D) extends T_A[D, T_A[D, D]]

val v_a: T_A[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(_) => 1 
}
}