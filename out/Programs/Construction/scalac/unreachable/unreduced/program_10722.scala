package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: (T_B[Byte, Int],T_A[Char]), b: T_B[T_B[Byte, Boolean], T_B[Byte, Char]], c: T_B[(Int,Boolean), T_A[Int]]) extends T_A[T_B[T_A[Boolean], T_B[Boolean, Byte]]]
case class CC_B(a: CC_A, b: (T_A[CC_A],Byte), c: T_B[CC_A, T_A[CC_A]]) extends T_A[T_B[T_A[Boolean], T_B[Boolean, Byte]]]

val v_a: T_A[T_B[T_A[Boolean], T_B[Boolean, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _), (_,0), _) => 1 
}
}
// This is not matched: CC_B(CC_A(_, _, _), (_,_), _)