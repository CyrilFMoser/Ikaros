package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Int, Int], T_A[Boolean, Int]], b: T_A[Boolean, T_A[Int, Boolean]], c: T_A[T_A[Char, Char], Char]) extends T_A[T_A[T_A[(Boolean,Boolean), Byte], Byte], T_A[T_A[Byte, Char], T_A[Int, Byte]]]
case class CC_B() extends T_A[T_A[T_A[(Boolean,Boolean), Byte], Byte], T_A[T_A[Byte, Char], T_A[Int, Byte]]]
case class CC_C() extends T_A[T_A[T_A[(Boolean,Boolean), Byte], Byte], T_A[T_A[Byte, Char], T_A[Int, Byte]]]

val v_a: T_A[T_A[T_A[(Boolean,Boolean), Byte], Byte], T_A[T_A[Byte, Char], T_A[Int, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C() => 2 
}
}