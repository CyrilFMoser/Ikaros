package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Int, Byte], T_B[Boolean, Char]], b: T_A[(Int,Char)]) extends T_A[T_B[T_B[Boolean, Char], T_B[Int, Byte]]]
case class CC_B[D, E](a: D) extends T_B[D, E]
case class CC_C() extends T_B[(T_A[CC_A],T_A[CC_A]), Char]
case class CC_D(a: CC_A, b: CC_C, c: CC_B[CC_A, (CC_C,CC_C)]) extends T_B[(T_A[CC_A],T_A[CC_A]), Char]

val v_a: T_B[(T_A[CC_A],T_A[CC_A]), Char] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, _, CC_B(CC_A(_, _))) => 1 
}
}
// This is not matched: CC_B((_,_))