package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[(Char,(Byte,Char)), C]
case class CC_B[D](a: T_A[D, D], b: D, c: T_A[T_A[D, D], D]) extends T_A[(Char,(Byte,Char)), D]
case class CC_C[E](a: CC_A[E], b: T_A[E, E], c: E) extends T_A[(Char,(Byte,Char)), E]

val v_a: T_A[(Char,(Byte,Char)), Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, _, _) => 2 
}
}