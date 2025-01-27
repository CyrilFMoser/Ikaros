package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Byte, Byte], b: T_A[T_A[Boolean, Int], Char], c: T_A[(Boolean,Char), T_A[Byte, Int]]) extends T_A[T_A[T_A[(Int,Char), Boolean], (Boolean,Char)], T_A[Byte, T_A[Int, (Byte,Boolean)]]]
case class CC_B(a: Int) extends T_A[T_A[T_A[(Int,Char), Boolean], (Boolean,Char)], T_A[Byte, T_A[Int, (Byte,Boolean)]]]
case class CC_C() extends T_A[T_A[T_A[(Int,Char), Boolean], (Boolean,Char)], T_A[Byte, T_A[Int, (Byte,Boolean)]]]

val v_a: T_A[T_A[T_A[(Int,Char), Boolean], (Boolean,Char)], T_A[Byte, T_A[Int, (Byte,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_C()