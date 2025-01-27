package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C], c: T_A[C, C]) extends T_A[T_A[((Char,Int),Char), T_A[Boolean, Byte]], C]
case class CC_B[D](a: D) extends T_A[T_A[((Char,Int),Char), T_A[Boolean, Byte]], D]
case class CC_C[E]() extends T_A[E, CC_A[E]]

val v_a: T_A[T_A[((Char,Int),Char), T_A[Boolean, Byte]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}