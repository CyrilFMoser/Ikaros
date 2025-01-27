package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C) extends T_A[(T_A[Char, Char],T_A[Char, Boolean]), C]
case class CC_B(a: T_A[CC_A[Byte], T_A[Int, Byte]], b: CC_A[CC_A[Char]]) extends T_A[(T_A[Char, Char],T_A[Char, Boolean]), T_A[T_A[Byte, Byte], Byte]]
case class CC_C() extends T_A[(T_A[Char, Char],T_A[Char, Boolean]), Boolean]

val v_a: T_A[(T_A[Char, Char],T_A[Char, Boolean]), Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C() => 1 
}
}