package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: D) extends T_A[D, E]
case class CC_B(a: Int) extends T_A[T_B[T_A[Boolean, Byte]], Char]
case class CC_C(a: (T_A[Boolean, CC_B],T_A[(Byte,Int), CC_B])) extends T_B[T_B[CC_B]]

val v_a: T_A[T_B[T_A[Boolean, Byte]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}