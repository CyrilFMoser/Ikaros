package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Char, b: T_A[Int]) extends T_A[T_A[T_A[Char]]]
case class CC_B[C](a: Boolean, b: Int, c: C) extends T_B[C]
case class CC_C[D](a: (CC_A,T_B[CC_A]), b: CC_A) extends T_B[D]
case class CC_D() extends T_B[Char]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(true, _, _) => 0 
  case CC_B(false, _, _) => 1 
  case CC_C((CC_A(_, _),CC_B(_, _, _)), _) => 2 
  case CC_C((CC_A(_, _),CC_C(_, _)), _) => 3 
}
}