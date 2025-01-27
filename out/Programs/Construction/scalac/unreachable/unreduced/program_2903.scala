package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[T_A[C, C], T_A[Int, C]]]
case class CC_B(a: T_A[Byte, T_A[Int, Boolean]], b: Char) extends T_A[CC_A[(Byte,Char)], T_A[T_A[CC_A[(Byte,Char)], CC_A[(Byte,Char)]], T_A[Int, CC_A[(Byte,Char)]]]]
case class CC_C[D](a: D) extends T_A[D, T_A[T_A[D, D], T_A[Int, D]]]

val v_a: T_A[CC_A[(Byte,Char)], T_A[T_A[CC_A[(Byte,Char)], CC_A[(Byte,Char)]], T_A[Int, CC_A[(Byte,Char)]]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C(CC_A()) => 2 
}
}