package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: (((Byte,Boolean),Int),Byte)) extends T_A[B]
case class CC_B(a: T_A[T_A[Byte]], b: Int, c: Int) extends T_A[T_A[T_A[(Int,Boolean)]]]

val v_a: T_A[T_A[T_A[(Int,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(CC_A(_, _), (_,_)), _, _) => 0 
}
}
// This is not matched: CC_A(_, _)