package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C]) extends T_A[C]
case class CC_B(a: Int) extends T_A[T_B[T_A[Boolean]]]
case class CC_C[D](a: Char, b: T_B[D]) extends T_A[D]
case class CC_D(a: T_A[CC_C[Boolean]], b: T_A[T_A[CC_B]]) extends T_B[CC_A[CC_A[CC_B]]]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_C(_, _))) => 1 
  case CC_C(_, _) => 2 
}
}
// This is not matched: CC_A(CC_C(_, _))