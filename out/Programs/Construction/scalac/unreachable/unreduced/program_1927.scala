package Program_18 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Int]], b: T_A[Byte]) extends T_A[T_A[T_A[(Byte,Char)]]]
case class CC_B(a: Byte, b: Boolean) extends T_A[T_A[T_A[(Byte,Char)]]]

val v_a: T_A[T_A[T_A[(Byte,Char)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(0, _) => 1 
  case CC_B(_, _) => 2 
}
}