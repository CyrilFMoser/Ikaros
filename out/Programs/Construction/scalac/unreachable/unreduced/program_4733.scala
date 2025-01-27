package Program_2 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[(Boolean,(Int,Byte))]) extends T_A[T_A[T_A[(Char,Boolean)]]]
case class CC_B(a: Int) extends T_A[T_A[T_A[(Char,Boolean)]]]
case class CC_C[B]() extends T_A[T_A[T_A[(Char,Boolean)]]]

val v_a: T_A[T_A[T_A[(Char,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(12) => 1 
  case CC_B(_) => 2 
  case CC_C() => 3 
}
}