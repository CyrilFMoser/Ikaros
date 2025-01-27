package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: (T_B[Char],T_B[Int])) extends T_A[(T_A[Char],T_A[Byte])]
case class CC_B() extends T_A[(T_A[Char],T_A[Byte])]
case class CC_C[C](a: C, b: T_B[C]) extends T_A[(T_A[Char],T_A[Byte])]
case class CC_D() extends T_B[CC_B]

val v_a: T_A[(T_A[Char],T_A[Byte])] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B() => 1 
  case CC_C(_, _) => 2 
}
}