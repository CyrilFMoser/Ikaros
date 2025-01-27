package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[Int, C]
case class CC_B[D](a: T_A[D, D], b: D) extends T_A[Int, D]
case class CC_C[E](a: T_A[Int, E]) extends T_A[Int, E]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C(CC_A(_)) => 2 
  case CC_C(CC_B(_, _)) => 3 
  case CC_C(CC_C(CC_A(_))) => 4 
  case CC_C(CC_C(CC_B(_, _))) => 5 
  case CC_C(CC_C(CC_C(_))) => 6 
}
}