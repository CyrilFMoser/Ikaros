package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[(T_A[Byte, Boolean],T_B[Byte]), D]
case class CC_B[F, E](a: T_B[F], b: (CC_A[Char],Boolean)) extends T_A[F, E]
case class CC_C() extends T_A[(T_A[Byte, Boolean],T_B[Byte]), Int]
case class CC_D(a: T_A[CC_C, T_B[Byte]], b: CC_B[CC_A[CC_C], T_A[CC_C, CC_C]], c: (Char,CC_C)) extends T_B[CC_B[CC_B[CC_C, CC_C], CC_B[CC_C, CC_C]]]
case class CC_E(a: CC_C, b: T_A[(Int,(Int,Int)), T_A[CC_D, CC_D]], c: T_A[Char, CC_A[CC_D]]) extends T_B[CC_B[CC_B[CC_C, CC_C], CC_B[CC_C, CC_C]]]
case class CC_F(a: T_A[CC_D, T_A[CC_C, CC_E]], b: CC_E) extends T_B[CC_B[CC_B[CC_C, CC_C], CC_B[CC_C, CC_C]]]

val v_a: T_A[(T_A[Byte, Boolean],T_B[Byte]), Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}