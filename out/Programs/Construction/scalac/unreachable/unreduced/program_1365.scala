package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Boolean, b: T_B) extends T_A[C, T_A[T_A[T_B, Int], T_B]]
case class CC_B[D]() extends T_A[(CC_A[Int],Char), T_A[T_A[T_B, Int], T_B]]
case class CC_C(a: CC_A[Char]) extends T_B
case class CC_D(a: T_B, b: (CC_C,Boolean)) extends T_B
case class CC_E(a: T_A[Boolean, CC_D]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _)) => 0 
  case CC_D(_, _) => 1 
  case CC_E(_) => 2 
}
}