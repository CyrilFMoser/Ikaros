package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C, b: T_B[C]) extends T_A[C]
case class CC_B[D]() extends T_A[D]
case class CC_C(a: CC_A[T_A[Int]], b: Int, c: CC_A[(Int,Boolean)]) extends T_B[(Char,T_A[Byte])]
case class CC_D(a: T_A[(CC_C,CC_C)]) extends T_B[(Char,T_A[Byte])]

val v_a: T_B[(Char,T_A[Byte])] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _), _, CC_A(_, _)) => 0 
  case CC_D(CC_B()) => 1 
}
}
// This is not matched: CC_D(CC_A(_, _))