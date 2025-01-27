package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: (Int,T_A[Char, (Int,Byte)]), b: Int, c: Int) extends T_A[T_A[T_B[Char, Byte], Char], E]
case class CC_B() extends T_B[Boolean, T_B[CC_A[Int], Boolean]]
case class CC_C(a: T_A[Int, ((Byte,Int),Int)], b: CC_B) extends T_B[Boolean, T_B[CC_A[Int], Boolean]]

val v_a: T_B[Boolean, T_B[CC_A[Int], Boolean]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, CC_B()) => 1 
}
}