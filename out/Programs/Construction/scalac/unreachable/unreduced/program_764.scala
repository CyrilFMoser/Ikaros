package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Char]], b: T_A[T_B[Int]], c: T_B[T_A[Int]]) extends T_A[(T_A[Char],T_B[Byte])]
case class CC_B() extends T_A[(T_A[Char],T_B[Byte])]
case class CC_C[C](a: T_B[C]) extends T_B[C]

val v_a: T_A[(T_A[Char],T_B[Byte])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_C(_)) => 0 
  case CC_B() => 1 
}
}