package Program_20 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[T_A[(Byte,Int)]]]
case class CC_B(a: CC_A, b: T_A[CC_A]) extends T_A[T_A[T_A[(Byte,Int)]]]
case class CC_C() extends T_A[T_A[T_A[(Byte,Int)]]]

val v_a: T_A[T_A[T_A[(Byte,Int)]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _) => 1 
  case CC_C() => 2 
}
}