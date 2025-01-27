package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Byte) extends T_A[T_A[C, C], C]
case class CC_B(a: T_A[T_A[CC_A[Byte], CC_A[Byte]], CC_A[Byte]], b: CC_A[CC_A[Boolean]]) extends T_A[T_A[(T_A[Byte, Byte],CC_A[(Boolean,Boolean)]), (T_A[Byte, Byte],CC_A[(Boolean,Boolean)])], (T_A[Byte, Byte],CC_A[(Boolean,Boolean)])]
case class CC_C(a: CC_A[Boolean], b: T_A[CC_B, CC_A[Char]]) extends T_A[T_A[(T_A[Byte, Byte],CC_A[(Boolean,Boolean)]), (T_A[Byte, Byte],CC_A[(Boolean,Boolean)])], (T_A[Byte, Byte],CC_A[(Boolean,Boolean)])]

val v_a: T_A[T_A[(T_A[Byte, Byte],CC_A[(Boolean,Boolean)]), (T_A[Byte, Byte],CC_A[(Boolean,Boolean)])], (T_A[Byte, Byte],CC_A[(Boolean,Boolean)])] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
  case CC_A(_) => 1 
  case CC_B(_, _) => 2 
  case CC_C(CC_A(_), _) => 3 
}
}