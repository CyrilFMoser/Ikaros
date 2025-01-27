package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: T_A[C, C], b: T_A[C, D]) extends T_A[D, C]

val v_a: CC_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), CC_A(_, _)), CC_A(CC_A(_, _), CC_A(_, _))) => 0 
}
}