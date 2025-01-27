package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_B) extends T_A[T_B, C]
case class CC_B[D]() extends T_A[T_B, D]
case class CC_C(a: Char) extends T_B

val v_a: T_A[T_B, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C(_)) => 0 
  case CC_B() => 1 
}
}