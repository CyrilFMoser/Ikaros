package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Char, Byte], T_A[Int, Int]], b: Int) extends T_A[T_A[T_A[Char, Byte], T_A[Boolean, Boolean]], T_A[T_A[(Byte,Char), (Int,Char)], T_A[Char, Byte]]]
case class CC_B(a: Char, b: Byte) extends T_A[T_A[T_A[Char, Byte], T_A[Boolean, Boolean]], T_A[T_A[(Byte,Char), (Int,Char)], T_A[Char, Byte]]]

val v_a: T_A[T_A[T_A[Char, Byte], T_A[Boolean, Boolean]], T_A[T_A[(Byte,Char), (Int,Char)], T_A[Char, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, 0) => 1 
  case CC_B(_, _) => 2 
}
}