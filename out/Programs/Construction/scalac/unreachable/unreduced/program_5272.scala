package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Int, Byte],T_A[Byte, Boolean])) extends T_A[C, Boolean]
case class CC_B[D]() extends T_A[T_A[CC_A[Char], Boolean], D]

val v_a: T_A[T_A[CC_A[Char], Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_A((_,CC_A(_))) => 0 
  case CC_B() => 1 
}
}