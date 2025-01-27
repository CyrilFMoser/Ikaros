package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[C, T_A[C, C]]
case class CC_B(a: T_A[CC_A[Byte], CC_A[Int]], b: CC_A[CC_A[Char]], c: CC_A[T_A[Int, Char]]) extends T_A[CC_A[(Byte,Boolean)], T_A[CC_A[(Byte,Boolean)], CC_A[(Byte,Boolean)]]]

val v_a: T_A[T_A[CC_A[(Byte,Boolean)], T_A[CC_A[(Byte,Boolean)], CC_A[(Byte,Boolean)]]], T_A[T_A[CC_A[(Byte,Boolean)], T_A[CC_A[(Byte,Boolean)], CC_A[(Byte,Boolean)]]], T_A[CC_A[(Byte,Boolean)], T_A[CC_A[(Byte,Boolean)], CC_A[(Byte,Boolean)]]]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_, _, _)) => 1 
}
}