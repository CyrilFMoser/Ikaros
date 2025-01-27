package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char, b: T_A[C, C], c: Boolean) extends T_A[T_A[C, C], C]
case class CC_B[D](a: D) extends T_A[T_A[D, D], D]

val v_a: T_A[T_A[Boolean, Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}