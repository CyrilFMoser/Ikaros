package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Byte, Boolean], T_A[Boolean, Char]], b: T_A[Char, T_A[Int, Char]], c: T_A[T_A[Char, Char], T_A[Byte, Boolean]]) extends T_A[(T_A[Byte, Char],T_A[Int, Char]), T_A[T_A[Boolean, Int], T_A[Char, Char]]]
case class CC_B(a: Byte) extends T_A[(T_A[Byte, Char],T_A[Int, Char]), T_A[T_A[Boolean, Int], T_A[Char, Char]]]
case class CC_C[C](a: T_A[C, C]) extends T_A[T_A[CC_B, CC_A], C]

val v_a: T_A[(T_A[Byte, Char],T_A[Int, Char]), T_A[T_A[Boolean, Int], T_A[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}