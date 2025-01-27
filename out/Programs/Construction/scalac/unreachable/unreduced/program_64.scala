package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[((Int,Int),T_A[Int, (Int,Boolean)]), C]
case class CC_B[D](a: T_A[D, D]) extends T_A[((Int,Int),T_A[Int, (Int,Boolean)]), D]
case class CC_C[E]() extends T_A[((Int,Int),T_A[Int, (Int,Boolean)]), E]

val v_a: T_A[((Int,Int),T_A[Int, (Int,Boolean)]), Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}