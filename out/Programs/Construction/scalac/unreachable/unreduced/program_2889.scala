package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A(a: Int) extends T_A[((Int,Boolean),T_A[Int])]
case class CC_B(a: T_A[CC_A], b: T_A[T_A[(Byte,Boolean)]]) extends T_A[((Int,Boolean),T_A[Int])]

val v_a: T_A[((Int,Boolean),T_A[Int])] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}