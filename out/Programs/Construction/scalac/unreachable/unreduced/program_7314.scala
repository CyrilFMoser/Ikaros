package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[(Int,Boolean), C]
case class CC_B[D](a: Boolean, b: Byte) extends T_A[(Int,Boolean), D]
case class CC_C[E](a: T_A[(Int,Boolean), E]) extends T_A[(Int,Boolean), E]

val v_a: T_A[(Int,Boolean), Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(true, _) => 1 
  case CC_B(false, _) => 2 
  case CC_C(CC_A(_, _)) => 3 
  case CC_C(CC_B(_, _)) => 4 
  case CC_C(CC_C(_)) => 5 
}
}