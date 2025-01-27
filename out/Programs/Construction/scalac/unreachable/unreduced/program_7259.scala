package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: D) extends T_A[D]
case class CC_B() extends T_A[CC_A[T_A[(Byte,Char)]]]
case class CC_C[E](a: (T_B[(Char,Char), Char],Int), b: CC_B, c: T_B[E, E]) extends T_B[E, T_A[(CC_B,CC_B)]]
case class CC_D(a: CC_C[CC_C[CC_B]], b: CC_A[T_A[CC_B]], c: T_A[T_A[CC_B]]) extends T_B[Char, T_A[(CC_B,CC_B)]]

val v_a: T_B[Char, T_A[(CC_B,CC_B)]] = null
val v_b: Int = v_a match{
  case CC_C((_,_), CC_B(), _) => 0 
  case CC_D(_, _, _) => 1 
}
}