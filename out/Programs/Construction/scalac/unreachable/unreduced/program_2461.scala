package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[Char]], b: T_A[T_B[Char]]) extends T_A[T_B[T_B[Byte]]]
case class CC_B[C]() extends T_B[C]
case class CC_C[D](a: T_A[D], b: (CC_A,CC_B[CC_A]), c: T_B[Byte]) extends T_B[D]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _, _) => 1 
}
}