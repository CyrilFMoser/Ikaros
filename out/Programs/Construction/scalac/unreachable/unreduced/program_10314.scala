package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[T_A[T_B]]
case class CC_B(a: (T_B,(T_B,Int)), b: T_A[T_A[CC_A]], c: T_A[T_A[T_B]]) extends T_B
case class CC_C() extends T_B
case class CC_D(a: Byte) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C() => 1 
  case CC_D(0) => 2 
  case CC_D(_) => 3 
}
}