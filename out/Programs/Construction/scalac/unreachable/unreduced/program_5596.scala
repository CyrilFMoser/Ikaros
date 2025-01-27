package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Int, Boolean], T_A[Boolean]], b: T_A[T_A[Int]], c: Boolean) extends T_A[T_B[T_A[Boolean], T_B[Char, Char]]]
case class CC_B(a: T_B[T_B[CC_A, CC_A], Boolean], b: T_B[T_A[(Boolean,Char)], CC_A]) extends T_A[T_B[T_A[Boolean], T_B[Char, Char]]]
case class CC_C() extends T_A[T_B[T_A[Boolean], T_B[Char, Char]]]
case class CC_D(a: Int) extends T_B[T_B[CC_C, (Byte,CC_B)], T_A[CC_A]]
case class CC_E(a: CC_A, b: Int) extends T_B[T_B[CC_C, (Byte,CC_B)], T_A[CC_A]]

val v_a: T_A[T_B[T_A[Boolean], T_B[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_, _)