package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char, b: T_A[C, C], c: C) extends T_A[(T_A[Int, Int],T_A[Char, Char]), C]
case class CC_B[D](a: CC_A[D], b: T_A[D, D], c: CC_A[D]) extends T_A[(T_A[Int, Int],T_A[Char, Char]), D]
case class CC_C[E, F]() extends T_A[(T_A[Int, Int],T_A[Char, Char]), E]

val v_a: T_A[(T_A[Int, Int],T_A[Char, Char]), Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _), _, CC_A(_, _, 0)) => 1 
  case CC_B(CC_A(_, _, _), _, CC_A(_, _, _)) => 2 
  case CC_C() => 3 
}
}