package Program_21 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_B[T_A, T_A], (T_A,T_A)]) extends T_A
case class CC_B() extends T_A
case class CC_C[C](a: (CC_B,CC_A)) extends T_B[C, CC_A]
case class CC_D[D, E](a: CC_B, b: T_A) extends T_B[D, CC_A]

val v_a: T_B[Int, CC_A] = null
val v_b: Int = v_a match{
  case CC_C((CC_B(),CC_A(_, _))) => 0 
  case CC_D(_, _) => 1 
}
}