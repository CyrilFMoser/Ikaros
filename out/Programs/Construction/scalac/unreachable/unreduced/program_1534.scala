package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: (T_B[Int],T_B[Int])) extends T_A[Byte, T_B[T_B[Byte]]]
case class CC_B(a: T_A[T_B[(Boolean,Char)], Int], b: Byte) extends T_A[Byte, T_B[T_B[Byte]]]
case class CC_C(a: (T_A[(Int,Int), Char],((Char,Char),CC_B))) extends T_A[Byte, T_B[T_B[Byte]]]

val v_a: T_A[Byte, T_B[T_B[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(_, _) => 1 
  case CC_C((_,_)) => 2 
}
}