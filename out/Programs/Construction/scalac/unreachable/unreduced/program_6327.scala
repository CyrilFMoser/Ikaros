package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Int, T_A[Int, Char]], b: T_A[T_A[Int, Boolean], Boolean]) extends T_A[(T_A[(Int,Char), Byte],T_A[Char, Boolean]), T_A[Int, T_A[Boolean, Char]]]
case class CC_B[C]() extends T_A[(T_A[(Int,Char), Byte],T_A[Char, Boolean]), T_A[Int, T_A[Boolean, Char]]]
case class CC_C(a: CC_B[CC_B[CC_A]], b: CC_A) extends T_A[(T_A[(Int,Char), Byte],T_A[Char, Boolean]), T_A[Int, T_A[Boolean, Char]]]

val v_a: T_A[(T_A[(Int,Char), Byte],T_A[Char, Boolean]), T_A[Int, T_A[Boolean, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_B()