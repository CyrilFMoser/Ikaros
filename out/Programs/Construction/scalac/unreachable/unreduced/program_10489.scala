package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[Int, Boolean]], b: T_B[T_B[Char, Int], Char]) extends T_A[(T_A[Char],T_A[Byte])]
case class CC_B() extends T_A[(T_A[Char],T_A[Byte])]
case class CC_C(a: Char) extends T_A[(T_A[Char],T_A[Byte])]

val v_a: T_A[(T_A[Char],T_A[Byte])] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}