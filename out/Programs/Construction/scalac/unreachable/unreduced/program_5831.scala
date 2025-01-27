package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_A[Byte], T_A[Char]], b: Char) extends T_A[(T_A[Char],(Boolean,Int))]
case class CC_B(a: Int) extends T_A[(T_A[Char],(Boolean,Int))]
case class CC_C[D, E](a: T_B[E, D], b: CC_A, c: Char) extends T_B[D, T_B[Char, T_B[CC_B, CC_B]]]

val v_a: T_A[(T_A[Char],(Boolean,Int))] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}