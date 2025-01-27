package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Boolean, T_A[Byte, (Char,Byte)]], b: T_A[T_A[Boolean, Int], T_A[Int, Byte]]) extends T_A[T_A[T_A[Byte, Byte], T_A[Int, Boolean]], T_A[Byte, T_A[Char, Char]]]
case class CC_B() extends T_A[T_A[T_A[Byte, Byte], T_A[Int, Boolean]], T_A[Byte, T_A[Char, Char]]]
case class CC_C() extends T_A[T_A[T_A[Byte, Byte], T_A[Int, Boolean]], T_A[Byte, T_A[Char, Char]]]

val v_a: T_A[T_A[T_A[Byte, Byte], T_A[Int, Boolean]], T_A[Byte, T_A[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C()