package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C]) extends T_A[C]
case class CC_B[D](a: CC_A[D]) extends T_A[D]
case class CC_C(a: CC_A[CC_A[Char]], b: CC_B[T_A[Char]], c: T_B[Char]) extends T_B[Char]
case class CC_D(a: T_A[CC_A[Char]], b: Boolean) extends T_B[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_, CC_B(_), CC_C(_, _, _))) => 0 
  case CC_A(CC_C(_, CC_B(_), CC_D(_, _))) => 1 
  case CC_A(CC_D(CC_A(_), _)) => 2 
  case CC_A(CC_D(CC_B(_), _)) => 3 
  case CC_B(CC_A(CC_C(_, _, _))) => 4 
  case CC_B(CC_A(CC_D(_, _))) => 5 
}
}