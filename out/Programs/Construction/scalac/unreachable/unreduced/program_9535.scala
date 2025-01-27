package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, (T_A[Byte, Boolean],T_A[Int, Char])]
case class CC_B[D](a: D) extends T_A[D, (T_A[Byte, Boolean],T_A[Int, Char])]
case class CC_C(a: CC_B[CC_B[Char]], b: T_A[CC_B[Int], CC_A[Char]], c: CC_A[CC_A[Int]]) extends T_A[Byte, (T_A[Byte, Boolean],T_A[Int, Char])]

val v_a: T_A[CC_C, (T_A[Byte, Boolean],T_A[Int, Char])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_C(_, _, CC_A())) => 1 
}
}