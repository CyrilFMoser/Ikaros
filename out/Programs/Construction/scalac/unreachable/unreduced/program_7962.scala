package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[Int]], b: T_B[T_B[Boolean]]) extends T_A[T_A[Char]]
case class CC_B[C](a: T_A[T_A[Char]]) extends T_B[C]
case class CC_C[D](a: T_B[T_A[CC_A]], b: CC_B[D]) extends T_B[D]
case class CC_D(a: T_B[CC_B[CC_A]]) extends T_B[T_B[Byte]]

val v_a: T_B[T_B[Byte]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _)) => 0 
  case CC_C(CC_B(CC_A(_, _)), CC_B(_)) => 1 
  case CC_C(CC_C(_, _), CC_B(_)) => 2 
  case CC_D(CC_B(_)) => 3 
  case CC_D(CC_C(CC_B(_), CC_B(_))) => 4 
  case CC_D(CC_C(CC_C(_, _), CC_B(_))) => 5 
}
}