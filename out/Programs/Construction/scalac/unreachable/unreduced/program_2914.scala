package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: D) extends T_A[C, T_A[C, Boolean]]
case class CC_B(a: T_A[T_A[Int, Boolean], CC_A[Byte, Byte]], b: CC_A[CC_A[Byte, Char], T_A[Int, Byte]], c: CC_A[T_A[Char, Int], Char]) extends T_A[(T_A[Byte, (Int,Byte)],T_A[Char, (Byte,Boolean)]), T_A[(T_A[Byte, (Int,Byte)],T_A[Char, (Byte,Boolean)]), Boolean]]
case class CC_C() extends T_A[CC_B, T_A[CC_B, Boolean]]

val v_a: T_A[(T_A[Byte, (Int,Byte)],T_A[Char, (Byte,Boolean)]), T_A[(T_A[Byte, (Int,Byte)],T_A[Char, (Byte,Boolean)]), Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
}
}