package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: (T_A[Boolean],T_A[Char])) extends T_A[T_B[T_B[Char, Boolean], Byte]]
case class CC_B() extends T_A[T_B[T_B[Char, Boolean], Byte]]
case class CC_C[D]() extends T_B[Char, D]

val v_a: T_A[T_B[T_B[Char, Boolean], Byte]] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B() => 1 
}
}