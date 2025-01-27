package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, T_A[D, D]]
case class CC_B() extends T_A[T_B[T_B[Int]], T_A[T_B[T_B[Int]], T_B[T_B[Int]]]]
case class CC_C(a: T_A[CC_B, T_A[CC_B, CC_B]], b: CC_A[Char], c: T_B[T_B[Char]]) extends T_B[T_B[Char]]
case class CC_D(a: T_B[CC_B], b: Int) extends T_B[T_B[Char]]
case class CC_E(a: T_B[T_B[Char]]) extends T_B[T_B[Char]]

val v_a: T_B[T_B[Char]] = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_C(CC_A(), CC_A(), _)) => 0 
  case CC_C(_, _, CC_D(_, _)) => 1 
  case CC_C(_, _, CC_E(_)) => 2 
  case CC_D(_, 12) => 3 
  case CC_D(_, _) => 4 
  case CC_E(_) => 5 
}
}