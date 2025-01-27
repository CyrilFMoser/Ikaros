package Program_17 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Byte, T_A], b: T_A, c: T_B[T_B[T_A, Char], Char]) extends T_A
case class CC_B() extends T_A
case class CC_C[C](a: T_A) extends T_B[C, Char]
case class CC_D[D](a: CC_A, b: D) extends T_B[D, Char]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), CC_D(_, _)) => 0 
  case CC_A(_, CC_B(), CC_C(_)) => 1 
  case CC_A(_, CC_B(), CC_D(_, _)) => 2 
  case CC_B() => 3 
}
}
// This is not matched: CC_A(_, CC_A(_, _, _), CC_C(_))