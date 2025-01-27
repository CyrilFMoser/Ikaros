package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Byte) extends T_A[(T_A[Boolean, Byte],T_A[Char, (Char,Int)]), (T_A[(Int,Boolean), Byte],T_A[Byte, Char])]
case class CC_B(a: CC_A, b: T_A[CC_A, CC_A], c: CC_A) extends T_A[(T_A[Boolean, Byte],T_A[Char, (Char,Int)]), (T_A[(Int,Boolean), Byte],T_A[Byte, Char])]

val v_a: T_A[(T_A[Boolean, Byte],T_A[Char, (Char,Int)]), (T_A[(Int,Boolean), Byte],T_A[Byte, Char])] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), _, _) => 1 
}
}