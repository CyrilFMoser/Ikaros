package Program_2 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]], b: Boolean, c: T_A[T_A[Int]]) extends T_A[T_A[(Byte,Byte)]]
case class CC_B(a: CC_A, b: CC_A) extends T_A[T_A[(Byte,Byte)]]

val v_a: T_A[T_A[(Byte,Byte)]] = null
val v_b: Int = v_a match{
  case CC_A(_, true, _) => 0 
  case CC_A(_, false, _) => 1 
  case CC_B(_, _) => 2 
}
}