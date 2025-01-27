package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: Int, c: (Int,T_A[Char, Int])) extends T_A[C, T_A[T_A[Byte, Int], T_A[(Byte,Byte), Byte]]]
case class CC_B[D]() extends T_A[D, T_A[T_A[Byte, Int], T_A[(Byte,Byte), Byte]]]
case class CC_C() extends T_A[(T_A[Int, Char],CC_B[Int]), T_A[T_A[Byte, Int], T_A[(Byte,Byte), Byte]]]

val v_a: T_A[(T_A[Int, Char],CC_B[Int]), T_A[T_A[Byte, Int], T_A[(Byte,Byte), Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (_,_)) => 0 
  case CC_B() => 1 
  case CC_C() => 2 
}
}