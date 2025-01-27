package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B(a: (T_A[Char],T_B[(Char,Char)]), b: CC_A[(Int,Char)], c: T_B[CC_A[Int]]) extends T_A[T_B[T_A[Char]]]
case class CC_C() extends T_A[T_B[T_A[Char]]]
case class CC_D[D](a: Byte, b: (CC_C,T_B[CC_B]), c: T_B[D]) extends T_B[D]

val v_a: CC_D[CC_C] = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
}
}