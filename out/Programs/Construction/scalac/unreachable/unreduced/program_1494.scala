package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C]) extends T_A[C]
case class CC_B[D](a: T_B[D]) extends T_A[D]
case class CC_C(a: T_A[T_A[Int]], b: T_A[CC_A[Byte]]) extends T_B[T_A[T_A[(Char,Boolean)]]]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_)) => 1 
  case CC_B(_) => 2 
}
}