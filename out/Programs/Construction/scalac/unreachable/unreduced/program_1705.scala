package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]], b: Byte, c: T_A[Byte]) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: CC_A, b: T_A[T_A[CC_A]], c: T_A[(CC_A,Int)]) extends T_A[CC_A]
case class CC_C(a: CC_A, b: Int) extends T_A[CC_A]

val v_a: T_A[CC_A] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_, _) => 1 
}
}