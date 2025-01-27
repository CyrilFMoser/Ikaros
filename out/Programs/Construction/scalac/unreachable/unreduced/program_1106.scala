package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[T_A[Char, Int], (Char,Char)]]
case class CC_B[D](a: T_A[D, D], b: D, c: D) extends T_A[D, T_A[T_A[Char, Int], (Char,Char)]]

val v_a: T_A[Int, T_A[T_A[Char, Int], (Char,Char)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}