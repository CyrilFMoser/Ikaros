package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Boolean, Int],T_A[Boolean, Byte]), b: C) extends T_A[C, T_A[Boolean, T_A[(Char,Byte), Byte]]]
case class CC_B[D](a: T_A[D, T_A[D, D]], b: T_A[D, D], c: T_A[D, T_A[D, D]]) extends T_A[D, T_A[D, D]]
case class CC_C[E]() extends T_A[E, T_A[E, E]]

val v_a: T_A[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_, _, _), _, CC_B(_, _, _)), _, _) => 0 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_C()), _, _) => 1 
  case CC_B(CC_B(CC_C(), _, CC_B(_, _, _)), _, _) => 2 
  case CC_B(CC_B(CC_C(), _, CC_C()), _, _) => 3 
  case CC_B(CC_C(), _, _) => 4 
  case CC_C() => 5 
}
}