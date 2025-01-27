package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Byte, (Byte,Char)], T_A[Char]], b: T_B[T_A[Char], T_A[Byte]], c: Char) extends T_A[T_B[T_B[Char, Int], Boolean]]
case class CC_B() extends T_A[T_B[T_B[Char, Int], Boolean]]
case class CC_C() extends T_A[T_B[T_B[Char, Int], Boolean]]
case class CC_D[D](a: CC_C) extends T_B[D, T_B[T_A[CC_B], CC_A]]
case class CC_E[E]() extends T_B[E, T_B[T_A[CC_B], CC_A]]
case class CC_F(a: CC_A) extends T_B[T_A[T_B[CC_B, (Boolean,Boolean)]], T_B[T_A[CC_B], CC_A]]

val v_a: T_A[T_B[T_B[Char, Int], Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B()