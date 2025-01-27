package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, Boolean], c: T_A[C, C]) extends T_A[C, Boolean]
case class CC_B[D](a: (T_A[(Boolean,Char), Boolean],T_A[Boolean, Boolean]), b: Boolean, c: T_A[D, Boolean]) extends T_A[D, Boolean]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B((CC_A(_, _, _),CC_A(_, _, _)), _, _) => 0 
  case CC_B((CC_A(_, _, _),CC_B(_, _, _)), _, _) => 1 
  case CC_B((CC_B(_, _, _),CC_A(_, _, _)), _, _) => 2 
  case CC_B((CC_B(_, _, _),CC_B(_, _, _)), _, _) => 3 
}
}