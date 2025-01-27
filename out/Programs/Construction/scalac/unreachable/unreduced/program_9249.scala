package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: Byte, c: Int) extends T_A[C, Boolean]
case class CC_B[D]() extends T_A[D, Boolean]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}