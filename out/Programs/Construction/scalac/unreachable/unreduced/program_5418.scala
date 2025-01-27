package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C], c: Boolean) extends T_A[C, (T_A[Int, Char],T_A[(Int,Byte), Char])]
case class CC_B[D]() extends T_A[D, (T_A[Int, Char],T_A[(Int,Byte), Char])]
case class CC_C() extends T_A[T_A[CC_B[Boolean], CC_B[Char]], (T_A[Int, Char],T_A[(Int,Byte), Char])]

val v_a: T_A[Char, (T_A[Int, Char],T_A[(Int,Byte), Char])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}