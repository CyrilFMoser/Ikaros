package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E]() extends T_A[C, D]
case class CC_B(a: Char) extends T_A[T_A[(Byte,(Byte,Int)), CC_A[(Char,Int), Byte, Boolean]], T_A[T_A[Byte, Byte], CC_A[Int, Char, (Char,Char)]]]
case class CC_C(a: Byte) extends T_A[T_A[(Byte,(Byte,Int)), CC_A[(Char,Int), Byte, Boolean]], T_A[T_A[Byte, Byte], CC_A[Int, Char, (Char,Char)]]]

val v_a: T_A[CC_B, Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}