package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: (T_A[(Byte,Int), Int],T_A[Byte, Boolean]), c: C) extends T_A[(T_A[Byte, Boolean],T_A[Boolean, Boolean]), C]
case class CC_B[D]() extends T_A[(T_A[Byte, Boolean],T_A[Boolean, Boolean]), D]
case class CC_C[E](a: E, b: CC_A[E]) extends T_A[(T_A[Byte, Boolean],T_A[Boolean, Boolean]), E]

val v_a: T_A[(T_A[Byte, Boolean],T_A[Boolean, Boolean]), Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_), _) => 0 
  case CC_B() => 1 
  case CC_C(_, _) => 2 
}
}