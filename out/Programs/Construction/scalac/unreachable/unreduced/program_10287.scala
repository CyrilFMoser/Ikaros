package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[Byte], b: Char, c: T_A[Byte]) extends T_A[(T_A[Char],T_B[Boolean])]
case class CC_B() extends T_A[(T_A[Char],T_B[Boolean])]

val v_a: T_A[(T_A[Char],T_B[Boolean])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}