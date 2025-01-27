package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Byte, b: T_A[T_A[C, C], C], c: C) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: (T_A[Boolean, Byte],T_A[Int, Boolean]), b: D, c: D) extends T_A[D, T_A[D, D]]
case class CC_C() extends T_A[CC_A[CC_B[(Byte,Boolean)]], T_A[CC_A[CC_B[(Byte,Boolean)]], CC_A[CC_B[(Byte,Boolean)]]]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, 'x') => 0 
  case CC_A(_, _, _) => 1 
  case CC_B(_, _, _) => 2 
}
}