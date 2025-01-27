package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C, c: (T_A[Boolean, Char],T_A[Int, Boolean])) extends T_A[C, T_A[Int, T_A[Byte, Boolean]]]
case class CC_B[D, E]() extends T_A[D, T_A[Int, T_A[Byte, Boolean]]]

val v_a: T_A[Byte, T_A[Int, T_A[Byte, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}