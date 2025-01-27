package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E]() extends T_A[E, D]
case class CC_B(a: T_A[T_A[(Byte,Char), Byte], T_A[Char, Boolean]], b: T_A[CC_A[Byte, Byte], Byte], c: T_A[T_B[Int], T_A[Boolean, Char]]) extends T_A[(T_B[Char],T_A[Char, Char]), T_A[Boolean, T_A[Boolean, Boolean]]]
case class CC_C(a: T_B[(CC_B,CC_B)], b: T_A[Int, CC_A[CC_B, CC_B]]) extends T_A[(T_B[Char],T_A[Char, Char]), T_A[Boolean, T_A[Boolean, Boolean]]]
case class CC_D(a: CC_C, b: CC_C) extends T_B[((CC_B,CC_C),T_A[Char, CC_C])]
case class CC_E(a: CC_A[CC_D, CC_B], b: CC_A[CC_B, Int], c: CC_C) extends T_B[((CC_B,CC_C),T_A[Char, CC_C])]
case class CC_F() extends T_B[((CC_B,CC_C),T_A[Char, CC_C])]

val v_a: T_A[(T_B[Char],T_A[Char, Char]), T_A[Boolean, T_A[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, CC_A()) => 2 
}
}