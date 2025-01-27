package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Char], b: T_A[T_A[C, C], C]) extends T_A[C, Char]
case class CC_B() extends T_A[T_A[(Int,Boolean), T_A[Byte, Char]], Char]
case class CC_C(a: CC_B) extends T_A[Char, Char]

val v_a: T_A[Char, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), CC_A(_, _)) => 0 
  case CC_A(CC_C(_), CC_A(_, _)) => 1 
  case CC_C(_) => 2 
}
}