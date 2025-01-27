package Program_25 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C]() extends T_A
case class CC_B(a: T_B[T_A, T_A], b: CC_A[CC_A[T_A]], c: T_B[T_B[T_A, Boolean], CC_A[T_A]]) extends T_A
case class CC_C(a: Boolean, b: (Char,(T_A,Byte)), c: CC_B) extends T_A
case class CC_D[D](a: D, b: D) extends T_B[(Boolean,T_B[CC_B, (Boolean,Char)]), D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, _, _) => 2 
}
}