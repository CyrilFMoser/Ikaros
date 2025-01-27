package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Int]]) extends T_A[T_B[T_B[Char]]]
case class CC_B(a: T_B[T_A[CC_A]], b: Int) extends T_A[T_B[T_B[Char]]]
case class CC_C[C](a: CC_B) extends T_B[C]
case class CC_D[D](a: D, b: T_B[D]) extends T_B[D]
case class CC_E() extends T_B[T_B[CC_B]]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(CC_C(_), _)) => 0 
  case CC_C(CC_B(CC_D(_, _), _)) => 1 
  case CC_D(_, CC_C(CC_B(_, _))) => 2 
  case CC_D(_, CC_D(_, _)) => 3 
}
}