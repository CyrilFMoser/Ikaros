package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: (T_A[Boolean],T_B[Byte])) extends T_A[(T_A[Char],T_A[Boolean])]
case class CC_B[D]() extends T_A[D]
case class CC_C(a: T_A[CC_A[Byte]], b: CC_A[CC_A[Byte]]) extends T_A[T_A[(Boolean,Int)]]
case class CC_D() extends T_B[T_A[CC_B[(Char,Int)]]]
case class CC_E(a: ((CC_D,CC_C),CC_B[CC_D])) extends T_B[T_A[CC_B[(Char,Int)]]]

val v_a: T_A[(T_A[Char],T_A[Boolean])] = null
val v_b: Int = v_a match{
  case CC_A((CC_B(),_)) => 0 
  case CC_B() => 1 
}
}