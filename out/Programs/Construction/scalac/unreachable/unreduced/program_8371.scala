package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_B[T_A, T_A]) extends T_A
case class CC_C[C](a: T_A) extends T_B[C, Byte]
case class CC_D[D](a: T_B[D, D], b: D) extends T_B[D, Byte]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_))) => 1 
  case CC_A(CC_B(_)) => 2 
  case CC_B(_) => 3 
}
}