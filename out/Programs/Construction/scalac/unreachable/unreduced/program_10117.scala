package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[(Byte,Boolean), T_A[Byte, Int]], b: T_A[T_A[Int, Byte], T_A[(Byte,Byte), Byte]]) extends T_A[T_A[T_A[(Byte,Int), Char], Int], T_A[T_A[Char, Int], T_A[Char, Byte]]]
case class CC_B() extends T_A[T_A[T_A[(Byte,Int), Char], Int], T_A[T_A[Char, Int], T_A[Char, Byte]]]

val v_a: T_A[T_A[T_A[(Byte,Int), Char], Int], T_A[T_A[Char, Int], T_A[Char, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}