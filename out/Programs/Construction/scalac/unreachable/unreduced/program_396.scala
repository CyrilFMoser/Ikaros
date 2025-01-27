package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[Char]
case class CC_B(a: T_A[CC_A], b: T_B[Int], c: T_B[Boolean]) extends T_A[Char]
case class CC_C[C](a: T_B[C]) extends T_B[C]
case class CC_D[D](a: CC_B, b: T_A[Char], c: T_A[Char]) extends T_B[D]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_)) => 0 
  case CC_C(CC_D(_, _, _)) => 1 
  case CC_D(_, CC_A(), CC_A()) => 2 
  case CC_D(_, CC_A(), CC_B(_, _, _)) => 3 
  case CC_D(_, CC_B(_, _, _), CC_A()) => 4 
  case CC_D(_, CC_B(_, _, _), CC_B(_, _, _)) => 5 
}
}