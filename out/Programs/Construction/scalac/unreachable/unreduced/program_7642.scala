package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[C, C], b: T_A[D, T_A[D, D]]) extends T_A[C, T_A[C, C]]
case class CC_B[E](a: E, b: Int, c: E) extends T_A[E, T_A[E, E]]
case class CC_C() extends T_A[T_A[CC_B[(Boolean,Byte)], T_A[Int, Boolean]], T_A[T_A[CC_B[(Boolean,Byte)], T_A[Int, Boolean]], T_A[CC_B[(Boolean,Byte)], T_A[Int, Boolean]]]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
}
}