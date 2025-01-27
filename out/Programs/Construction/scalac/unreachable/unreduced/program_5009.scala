package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Char, Int], T_B[Char, Byte]]) extends T_A[T_A[T_A[(Byte,Boolean)]]]
case class CC_B(a: T_A[CC_A]) extends T_A[T_A[T_A[(Byte,Boolean)]]]

val v_a: T_A[T_A[T_A[(Byte,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}