package Program_7 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[T_A[(Byte,Boolean)]]]
case class CC_B(a: CC_A, b: T_A[CC_A]) extends T_A[T_A[T_A[(Byte,Boolean)]]]

val v_a: T_A[T_A[T_A[(Byte,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}