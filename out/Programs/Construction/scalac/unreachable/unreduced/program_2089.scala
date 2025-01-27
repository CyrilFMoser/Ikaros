package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: (Int,Int), b: T_A[T_B[(Char,Byte), Boolean]], c: Int) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: Char, b: Char) extends T_A[T_A[T_A[Byte]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _, _) => 0 
  case CC_B(_, 'x') => 1 
  case CC_B(_, _) => 2 
}
}