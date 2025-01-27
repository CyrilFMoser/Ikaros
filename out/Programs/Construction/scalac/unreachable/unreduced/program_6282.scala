package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_A[Boolean, T_B[Char]], b: T_B[T_A[Char, Byte]], c: T_A[T_A[Boolean, Int], (Char,Char)]) extends T_A[T_B[T_B[Boolean]], T_B[T_B[Char]]]
case class CC_B() extends T_A[T_B[T_B[Boolean]], T_B[T_B[Char]]]
case class CC_C[D](a: D, b: T_B[D], c: T_A[D, T_B[D]]) extends T_B[D]
case class CC_D[E]() extends T_B[E]
case class CC_E(a: Byte, b: T_B[Int], c: Char) extends T_B[Int]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_C(_, _, _), _) => 0 
  case CC_D() => 1 
}
}
// This is not matched: CC_C(_, CC_D(), _)