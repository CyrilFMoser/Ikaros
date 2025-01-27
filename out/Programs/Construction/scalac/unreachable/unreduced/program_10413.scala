package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[C, C], C]
case class CC_B[D](a: CC_A[D], b: D, c: T_A[D, D]) extends T_A[T_A[D, D], D]
case class CC_C(a: T_A[((Int,Int),Boolean), T_A[Boolean, Int]]) extends T_A[T_A[Char, Char], Char]

val v_a: T_A[T_A[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, _) => 1 
  case CC_C(_) => 2 
}
}