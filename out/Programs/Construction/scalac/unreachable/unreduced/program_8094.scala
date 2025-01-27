package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Byte) extends T_A[T_B[T_B[(Char,Char)]]]
case class CC_B(a: Boolean) extends T_A[T_B[T_B[(Char,Char)]]]
case class CC_C(a: T_A[T_B[Boolean]], b: T_A[CC_A]) extends T_A[T_B[T_B[(Char,Char)]]]

val v_a: T_A[T_B[T_B[(Char,Char)]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _) => 2 
}
}