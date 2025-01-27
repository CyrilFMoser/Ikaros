package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Char, T_A[Boolean, Int]], b: T_A[T_A[(Boolean,Char), Char], T_A[(Int,Boolean), Char]], c: T_A[T_A[Boolean, Byte], (Byte,Int)]) extends T_A[T_A[T_A[Boolean, Int], ((Byte,Byte),Int)], Char]
case class CC_B(a: CC_A) extends T_A[T_A[T_A[Boolean, Int], ((Byte,Byte),Int)], Char]

val v_a: T_A[T_A[T_A[Boolean, Int], ((Byte,Byte),Int)], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}