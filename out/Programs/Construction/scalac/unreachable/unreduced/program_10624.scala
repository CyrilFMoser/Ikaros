package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, Boolean]
case class CC_B[D](a: (T_A[Byte, Boolean],T_A[Int, Boolean]), b: T_A[D, D]) extends T_A[D, Boolean]
case class CC_C(a: CC_A[Char], b: (CC_A[Boolean],(Char,Int))) extends T_A[T_A[T_A[Boolean, (Char,Int)], T_A[Boolean, Int]], Boolean]

val v_a: T_A[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((CC_A(),CC_A()), _) => 1 
  case CC_B((CC_B(_, _),CC_A()), _) => 2 
  case CC_B((CC_B(_, _),CC_B(_, _)), _) => 3 
}
}
// This is not matched: CC_B((CC_A(),CC_B(_, _)), _)