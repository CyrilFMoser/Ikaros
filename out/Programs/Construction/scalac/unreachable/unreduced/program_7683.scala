package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[C, Boolean]
case class CC_B[D](a: (T_A[Byte, Boolean],T_A[Char, Int])) extends T_A[D, Boolean]

val v_a: T_A[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B((CC_A(_),_)) => 1 
  case CC_B((CC_B(_),_)) => 2 
}
}