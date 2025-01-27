package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Char, T_A[Boolean, Boolean]], b: Boolean) extends T_A[T_A[((Boolean,Int),Int), T_A[Int, Char]], Boolean]
case class CC_B(a: Boolean) extends T_A[T_A[((Boolean,Int),Int), T_A[Int, Char]], Boolean]

val v_a: T_A[T_A[((Boolean,Int),Int), T_A[Int, Char]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}