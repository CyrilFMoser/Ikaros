package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, T_A[T_B[Byte], T_A[(Int,Byte), Char]]]
case class CC_B(a: T_B[T_A[Char, Char]], b: T_A[Boolean, Char]) extends T_A[T_B[(Byte,Int)], T_A[T_B[Byte], T_A[(Int,Byte), Char]]]
case class CC_C[E]() extends T_A[T_B[(Byte,Int)], T_A[T_B[Byte], T_A[(Int,Byte), Char]]]

val v_a: T_A[T_B[(Byte,Int)], T_A[T_B[Byte], T_A[(Int,Byte), Char]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C() => 2 
}
}