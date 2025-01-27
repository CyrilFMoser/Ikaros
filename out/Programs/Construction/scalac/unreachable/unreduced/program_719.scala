package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[Char], b: Char, c: T_A[(Char,Int)]) extends T_A[Char]
case class CC_B(a: Char) extends T_A[Char]
case class CC_C(a: T_B[T_A[CC_B]]) extends T_A[Char]
case class CC_D[C](a: T_B[C], b: CC_B) extends T_B[C]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, 'x', _) => 0 
  case CC_A(_, _, _) => 1 
  case CC_B(_) => 2 
  case CC_C(CC_D(_, _)) => 3 
}
}