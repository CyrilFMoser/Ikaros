package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B) extends T_A[C, (Int,T_A[T_B, T_B])]
case class CC_B[D](a: T_A[D, D]) extends T_A[D, (Int,T_A[T_B, T_B])]
case class CC_C(a: T_B) extends T_B

val v_a: T_A[Char, (Int,T_A[T_B, T_B])] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(CC_C(_))) => 0 
  case CC_B(_) => 1 
}
}