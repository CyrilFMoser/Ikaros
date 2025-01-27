package Program_8 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Char],T_A[Char]), b: (T_A[Char],(Char,Char)), c: T_A[T_A[Boolean]]) extends T_A[T_A[T_A[(Boolean,Int)]]]
case class CC_B(a: Int) extends T_A[T_A[T_A[(Boolean,Int)]]]
case class CC_C(a: CC_B, b: Byte) extends T_A[T_A[T_A[(Boolean,Int)]]]

val v_a: T_A[T_A[T_A[(Boolean,Int)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_B(_)