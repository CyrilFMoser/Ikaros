package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[C, T_A[T_A[Char, Char], T_A[Int, Char]]]
case class CC_B() extends T_A[T_A[Char, Char], T_A[T_A[Char, Char], T_A[Int, Char]]]
case class CC_C[D](a: CC_B, b: D) extends T_A[T_A[T_A[CC_B, CC_B], T_A[CC_B, CC_B]], D]

val v_a: T_A[T_A[Char, Char], T_A[T_A[Char, Char], T_A[Int, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}