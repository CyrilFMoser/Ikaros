package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_A[T_B[Byte], T_B[(Boolean,Boolean)]], b: Boolean, c: T_B[Byte]) extends T_A[T_A[(Boolean,(Byte,Boolean)), Char], T_B[T_B[Char]]]
case class CC_B(a: T_B[T_B[CC_A]]) extends T_A[T_A[(Boolean,(Byte,Boolean)), Char], T_B[T_B[Char]]]

val v_a: T_A[T_A[(Boolean,(Byte,Boolean)), Char], T_B[T_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}