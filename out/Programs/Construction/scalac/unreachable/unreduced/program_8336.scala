package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, Byte]], b: T_A[C, C], c: T_A[C, Byte]) extends T_A[C, Byte]
case class CC_B[D](a: T_A[D, Byte]) extends T_A[D, Byte]
case class CC_C[E](a: T_A[E, Byte]) extends T_A[E, Byte]

val v_a: T_A[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_C(CC_A(_, _, CC_A(_, _, _))) => 2 
  case CC_C(CC_A(_, _, CC_B(_))) => 3 
  case CC_C(CC_A(_, _, CC_C(_))) => 4 
  case CC_C(CC_B(CC_A(_, _, _))) => 5 
  case CC_C(CC_B(CC_B(_))) => 6 
  case CC_C(CC_B(CC_C(_))) => 7 
  case CC_C(CC_C(CC_A(_, _, _))) => 8 
  case CC_C(CC_C(CC_B(_))) => 9 
  case CC_C(CC_C(CC_C(_))) => 10 
}
}