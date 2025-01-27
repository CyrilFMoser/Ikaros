package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Byte, b: Char, c: Int) extends T_A[(T_A[Int, Char],T_A[Boolean, Char]), T_A[T_A[Byte, Boolean], T_A[Boolean, Boolean]]]
case class CC_B(a: T_A[Byte, T_A[CC_A, CC_A]], b: T_A[T_A[CC_A, Boolean], CC_A]) extends T_A[(T_A[Int, Char],T_A[Boolean, Char]), T_A[T_A[Byte, Boolean], T_A[Boolean, Boolean]]]
case class CC_C(a: Byte, b: CC_B) extends T_A[(T_A[Int, Char],T_A[Boolean, Char]), T_A[T_A[Byte, Boolean], T_A[Boolean, Boolean]]]

val v_a: T_A[(T_A[Int, Char],T_A[Boolean, Char]), T_A[T_A[Byte, Boolean], T_A[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _) => 2 
}
}