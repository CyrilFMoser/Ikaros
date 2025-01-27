package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Boolean, Char], T_A[Int, Byte]], b: T_A[T_A[Char, Byte], T_A[Byte, Byte]]) extends T_A[(T_A[Byte, Char],T_A[Int, Int]), Char]
case class CC_B() extends T_A[(T_A[Byte, Char],T_A[Int, Int]), Char]

val v_a: T_A[(T_A[Byte, Char],T_A[Int, Int]), Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}