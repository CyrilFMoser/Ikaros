package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[T_A[Char, Boolean], (Char,(Boolean,Char))]]
case class CC_B[D](a: D, b: CC_A[D], c: T_A[CC_A[D], D]) extends T_A[D, T_A[T_A[Char, Boolean], (Char,(Boolean,Char))]]

val v_a: T_A[Int, T_A[T_A[Char, Boolean], (Char,(Boolean,Char))]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}