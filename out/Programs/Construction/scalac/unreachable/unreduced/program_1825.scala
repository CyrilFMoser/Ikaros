package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C], b: C, c: (T_A[(Int,Byte), Byte],T_A[(Char,Boolean), (Int,Int)])) extends T_A[C, T_A[Boolean, T_A[Byte, Int]]]
case class CC_B[D](a: Byte) extends T_A[D, T_A[Boolean, T_A[Byte, Int]]]

val v_a: T_A[Char, T_A[Boolean, T_A[Byte, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(0) => 1 
}
}
// This is not matched: CC_B(_)