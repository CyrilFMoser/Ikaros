package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Char, Char], T_A[Int, Int]], b: T_A[(Boolean,Byte), T_A[Boolean, Byte]]) extends T_A[T_A[(Int,Boolean), T_A[Char, Boolean]], ((Boolean,Boolean),T_A[Int, Char])]
case class CC_B(a: CC_A) extends T_A[T_A[(Int,Boolean), T_A[Char, Boolean]], ((Boolean,Boolean),T_A[Int, Char])]

val v_a: T_A[T_A[(Int,Boolean), T_A[Char, Boolean]], ((Boolean,Boolean),T_A[Int, Char])] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}