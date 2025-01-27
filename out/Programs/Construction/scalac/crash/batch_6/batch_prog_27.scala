package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: D, b: (T_A[Int, Boolean],T_A[Boolean, Byte])) extends T_A[C, D]
case class CC_B() extends T_A[T_A[CC_A[Int, Boolean], CC_A[Char, Char]], (T_A[Int, Boolean],T_A[Int, Byte])]

val v_a: T_A[CC_B, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, (CC_A(_, _),CC_A(_, _))) => 0 
}
}