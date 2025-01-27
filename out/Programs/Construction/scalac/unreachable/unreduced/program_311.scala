package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[D, T_A[C, Char]], b: Int) extends T_A[C, Char]
case class CC_B() extends T_A[T_A[CC_A[Byte, Char], Char], Char]

val v_a: T_A[T_A[CC_A[Byte, Char], Char], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}