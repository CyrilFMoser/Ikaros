package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Int, Byte], T_A[Int, (Char,Int)]], b: T_A[T_A[Byte, Int], Char]) extends T_A[Int, T_A[T_A[Char, Int], T_A[Boolean, Char]]]
case class CC_B() extends T_A[Int, T_A[T_A[Char, Int], T_A[Boolean, Char]]]
case class CC_C[C](a: CC_A, b: C, c: C) extends T_A[Int, T_A[T_A[Char, Int], T_A[Boolean, Char]]]

val v_a: T_A[Int, T_A[T_A[Char, Int], T_A[Boolean, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(_, _, _)