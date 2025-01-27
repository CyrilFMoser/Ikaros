package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[C, T_A[T_A[Char, Int], T_A[(Int,Char), Char]]]
case class CC_B() extends T_A[CC_A[T_A[Byte, Int]], T_A[T_A[Char, Int], T_A[(Int,Char), Char]]]
case class CC_C[D](a: T_A[D, D], b: D) extends T_A[D, T_A[T_A[Char, Int], T_A[(Int,Char), Char]]]

val v_a: T_A[CC_A[T_A[Byte, Int]], T_A[T_A[Char, Int], T_A[(Int,Char), Char]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_B() => 1 
  case CC_C(_, CC_A(_)) => 2 
}
}