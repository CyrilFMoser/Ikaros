package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char, b: T_A[C, C], c: T_A[C, C]) extends T_A[C, T_A[(Int,Char), T_A[Int, (Boolean,Boolean)]]]
case class CC_B(a: Byte, b: T_A[((Int,Boolean),Byte), Byte]) extends T_A[CC_A[Char], T_A[(Int,Char), T_A[Int, (Boolean,Boolean)]]]
case class CC_C[D, E](a: T_A[D, E]) extends T_A[D, T_A[(Int,Char), T_A[Int, (Boolean,Boolean)]]]

val v_a: T_A[T_A[CC_A[Char], T_A[(Int,Char), T_A[Int, (Boolean,Boolean)]]], T_A[(Int,Char), T_A[Int, (Boolean,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(_) => 1 
}
}