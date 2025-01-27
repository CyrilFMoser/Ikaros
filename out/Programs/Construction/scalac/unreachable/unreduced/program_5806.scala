package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[T_A[Char, Char], Byte]]
case class CC_B[D](a: T_A[D, D], b: T_A[D, T_A[D, D]], c: D) extends T_A[D, T_A[T_A[Char, Char], Byte]]

val v_a: T_A[Boolean, T_A[T_A[Char, Char], Byte]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, true) => 1 
  case CC_B(_, _, false) => 2 
}
}