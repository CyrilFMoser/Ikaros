package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E]) extends T_A[E, T_B[T_B[E, E], E]]
case class CC_B(a: Boolean) extends T_A[T_A[CC_A[Boolean], ((Char,Byte),Int)], T_B[T_B[T_A[CC_A[Boolean], ((Char,Byte),Int)], T_A[CC_A[Boolean], ((Char,Byte),Int)]], T_A[CC_A[Boolean], ((Char,Byte),Int)]]]
case class CC_C() extends T_B[T_A[(CC_B,CC_B), CC_B], T_A[Boolean, T_A[CC_B, CC_B]]]
case class CC_D(a: T_B[Char, T_B[CC_C, CC_B]]) extends T_B[T_A[(CC_B,CC_B), CC_B], T_A[Boolean, T_A[CC_B, CC_B]]]

val v_a: T_A[T_A[CC_A[Boolean], ((Char,Byte),Int)], T_B[T_B[T_A[CC_A[Boolean], ((Char,Byte),Int)], T_A[CC_A[Boolean], ((Char,Byte),Int)]], T_A[CC_A[Boolean], ((Char,Byte),Int)]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}