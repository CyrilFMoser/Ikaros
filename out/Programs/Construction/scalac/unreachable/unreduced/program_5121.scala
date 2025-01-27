package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Int, b: Int, c: T_A[C, C]) extends T_A[C, T_A[C, C]]
case class CC_B() extends T_A[CC_A[T_A[Boolean, (Byte,Boolean)]], T_A[CC_A[T_A[Boolean, (Byte,Boolean)]], CC_A[T_A[Boolean, (Byte,Boolean)]]]]

val v_a: T_A[CC_A[T_A[Boolean, (Byte,Boolean)]], T_A[CC_A[T_A[Boolean, (Byte,Boolean)]], CC_A[T_A[Boolean, (Byte,Boolean)]]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}