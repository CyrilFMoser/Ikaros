package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Int, Char],Int)) extends T_A[C, Byte]
case class CC_B[D]() extends T_A[D, Byte]
case class CC_C[E](a: T_A[E, Byte]) extends T_A[E, Byte]

val v_a: CC_C[Int] = null
val v_b: Int = v_a match{
  case CC_C(CC_A((_,_))) => 0 
  case CC_C(CC_B()) => 1 
  case CC_C(CC_C(_)) => 2 
}
}