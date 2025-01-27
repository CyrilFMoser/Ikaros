package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Int, Boolean],T_A[Char, Boolean]), b: T_A[C, C]) extends T_A[C, Boolean]
case class CC_B[D]() extends T_A[D, Boolean]

val v_a: T_A[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_, _),CC_B()), _) => 0 
  case CC_A((CC_B(),CC_A(_, _)), _) => 1 
  case CC_A((CC_B(),CC_B()), _) => 2 
  case CC_B() => 3 
}
}
// This is not matched: CC_A((CC_A(_, _),CC_A(_, _)), _)