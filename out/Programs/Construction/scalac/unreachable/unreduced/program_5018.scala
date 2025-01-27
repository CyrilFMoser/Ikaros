package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E) extends T_A[E, Char]
case class CC_B(a: T_B[T_A[Char, Char], T_A[Char, Char]], b: T_A[T_A[Byte, Char], T_A[Int, Char]], c: T_B[Char, T_A[Byte, Char]]) extends T_B[(T_A[Byte, Char],T_A[Byte, Char]), T_A[T_A[Byte, Int], T_B[(Int,Boolean), Byte]]]
case class CC_C(a: Byte) extends T_B[(T_A[Byte, Char],T_A[Byte, Char]), T_A[T_A[Byte, Int], T_B[(Int,Boolean), Byte]]]
case class CC_D(a: (CC_C,T_B[(Char,Boolean), CC_B])) extends T_B[(T_A[Byte, Char],T_A[Byte, Char]), T_A[T_A[Byte, Int], T_B[(Int,Boolean), Byte]]]

val v_a: T_B[(T_A[Byte, Char],T_A[Byte, Char]), T_A[T_A[Byte, Int], T_B[(Int,Boolean), Byte]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_D(_)