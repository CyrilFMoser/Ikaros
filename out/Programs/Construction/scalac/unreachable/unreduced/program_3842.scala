package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Char, Boolean], (Int,Byte)], b: T_A[Byte], c: T_A[Char]) extends T_A[T_B[T_B[Byte, (Boolean,Boolean)], T_B[Char, Boolean]]]
case class CC_B(a: Int) extends T_A[T_B[T_B[Byte, (Boolean,Boolean)], T_B[Char, Boolean]]]

val v_a: T_A[T_B[T_B[Byte, (Boolean,Boolean)], T_B[Char, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}