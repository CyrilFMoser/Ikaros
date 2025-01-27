package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[Boolean], b: Byte) extends T_A[T_B[T_A[Char]]]
case class CC_B[C](a: T_A[C], b: Byte, c: T_B[C]) extends T_B[C]
case class CC_C[D](a: T_B[D], b: Boolean, c: T_B[D]) extends T_B[D]
case class CC_D[E]() extends T_B[E]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_, _, CC_B(_, _, CC_B(_, _, _))) => 1 
  case CC_C(_, _, CC_B(_, _, CC_C(_, _, _))) => 2 
  case CC_C(_, _, CC_B(_, _, CC_D())) => 3 
  case CC_C(_, _, CC_C(_, _, _)) => 4 
  case CC_C(_, _, CC_D()) => 5 
}
}
// This is not matched: CC_D()